import os #Importing os
import boto3 #Importing boto3
from boto3.dynamodb.conditions import Key, Attr #Importing Key and Attribute variables from DynamoDB

dynamodb = boto3.resource('dynamodb') #Initializing DynamoDB

def create_film_table(): #Function to create film table
    try:
        film_table = dynamodb.create_table(
            TableName = "Film_Catalogue",
            KeySchema = [
                {
                    "AttributeName": "Year",
                    "KeyType": "HASH"
                },
                
                {
                    "AttributeName": "FilmID",
                    "KeyType": "RANGE"
                }
                ],
                
                AttributeDefinitions = [
                     {
                        "AttributeName": "FilmID",
                        "AttributeType": "N"
                    },
                    {
                        "AttributeName": "Year",
                        "AttributeType": "S"
                    }
                    ],
                    
                    
                    ProvisionedThroughput = {
                        'ReadCapacityUnits': 100,
                        'WriteCapacityUnits': 100
                    }
            )
    except Exception as e:
        print(f"Error building table: {e}") #Catching an exception
        
def film_lookup(): #Function to look up a specific film from the database
    print("Welcome! You have now accessed the lost film catalogue.")
    table = dynamodb.Table("Film_Catalogue")
    search_done = False
    
    while not search_done: #Ensuring the user keeps being prompted for the ID and release year of the film.
        FilmID = None
        release_year = None
        next = None
        while not FilmID:
            FilmID = input("Please enter the four digit ID of the film you are looking for: \n")
            
            if len(FilmID) not in range(2,5):
                FilmID = None
        while not release_year:
            try:
                release_year = int(input("Please enter the release year of the film you are looking for: \n"))
            except Exception as e:
                print(f"Data Collection Error: {e}") #Catching exceptions
                
            try: #Try loop to generate the requested data for the film
                response = table.query(
                    KeyConditionExpression=Key('FilmID').eq(FilmID)
                    )
                response = list(
                    filter(lambda x: x['Year'] == release_year, response['Items'])
                        )
                response_title = response[0]["Title"]
                    
                response_director = response[0]["Director"]
                    
                print(f'The film you are looking for is: {response_title}. It was directed by: {response_director}.')
            except Exception as e:
                print(f"We apologize. No film with such data exists in our database:{e}\n\n") #Catchin exception if data is invalid
                
            while next not in ["n","y"]: #While loop to request confirmation of further actions
                next = input("Would you like to look up a film again? (Y or N)").lower()
                    
                if next == "y":
                    FilmID = None
                    release_year = None
                elif next == "n":
                    search_done = True
                    print("""\n\n Thank you for using the film catalogue. You will now
                    be redirected to the main menu. Have a great day!""") #Exiting catalogue if user is done with search
                    return
                else:
                    pass
        
while (True): #While loop for user guide and main menu
    print("Welcome to the International Database of Lost Films")
    print("USER GUIDE:")
    print("This application was developed as a result of its creator's fascination with lost media.")
    print("""It is a concept program of a film database, with the twist being that all of the films in it
    are currently considered lost, due to poor storage, natural disasters, and other reasons.""")
    print("The titles it contains, and the information about them, are all real-life examples of such films.")
    print("""To use the app, the user simply has to enter a number that corresponds with an option on the Main Menu
    into the selection prompt. The program will then use the function corresponding to the selection to
    to perform the action stated on the menu.""")
    print("""Among the options, the user is also given the choice to store a film they supposedly found
    into a special repository for found films. In the real world, this would be an option if someone wanted to
    report a film that they have recently discovered. (NOTE: This is a very 'raw' idea, and would work a bit
    differently in the real world. For purposes of the Assignment, the found 'film' is actually a '.txt' file).""")
    print("Main Menu:")
    print("1. Create table for lost films")
    print("2. Create bucket repository for found films")
    print("3. Place newly found film into repository")
    print("4. Search for a film")
    print("5. Download found film from repository")
    print("6. Delete found film from repository")
    print("7. Exit Program")
    
    print("Please enter your selection: ") #Initial selection prompt
    user_choice = int(input())
    
    s3 = boto3.client('s3')
    
    bucket_name = "found-film-repository"
    KEY = "Metropolis.txt"
    
    if user_choice == 1: #Choice to create the film catalogue
        create_film_table()
        print('\nTable "Film_Catalogue" created successfully.')
    if user_choice == 2: #Choice to create the "Found_film_repository" bucket
        s3.create_bucket(Bucket = bucket_name)
        print('\nBucket', bucket_name, ' has been created successfully.')
    if user_choice == 3: #Choice to add newly found 'film' (in actuality, a .txt file) to directory
        current_directory = os.getcwd()
        file = "Metropolis.txt"
        file_name = os.path.join(current_directory, 'SDEV400Homework4MarkKardash/files', file)
        files = open(file_name, 'rb')
        s3.upload_file(file_name, bucket_name, file)
        print('Film ', file_name, ' has been successfully added to ', bucket_name)
    if user_choice == 4: #Choice to look up a film from the catalogue
        film_lookup()
    if user_choice == 5: #Choice to download the found film from 'Found_film_repository' bucket
        s3 = boto3.resource('s3')
        bucket_name = 'found-film-repository'
        KEY = 'Metropolis.txt'
        save_as = 'Metropolis-download.txt'
        s3.Bucket(bucket_name).download_file(KEY, save_as)
        print('\n The film ', KEY, 'has been successfully downloaded from ', bucket_name, 'and saved as ', save_as)
    if user_choice == 6: #Choice to delete found film from 'repository' bucket
        file_name = 'Metropolis.txt'
        s3.delete_object(Bucket=bucket_name, Key=file_name)
        print('The film ', file_name, ' has been successfully deleted from ', bucket_name)
    if user_choice == 7: #Choice to exit the program
        print("Thank you for using the International Database of Lost Films! Come again!")
        break
    elif user_choice>7: #Invalid choice scenario with error message
        print("Oops! That selection was invalid. Please try again.")
    
        
        
        
        
