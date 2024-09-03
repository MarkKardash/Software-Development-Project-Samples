import os

import boto3
from boto3.dynamodb.conditions import Key, Attr

dynamodb = boto3.resource('dynamodb')

def build_course_tbl():
    try:
        course_tbl = dynamodb.create_table(
            TableName = 'Courses',
            KeySchema = [
                {
                    "AttributeName": "Subject",
                    "KeyType": "HASH"
                },
                {
                    "AttributeName": "CourseID",
                    "KeyType":"RANGE"
                }
            ],
            AttributeDefinitions = [
                {
                    "AttributeName": "CourseID",
                    "AttributeType": "S"
                },
                {
                    "AttributeName": "Subject",
                    "AttributeType": "S"
                }
            ],
            ProvisionedThroughput = {
                'ReadCapacityUnits': 10,
                'WriteCapacityUnits': 10
            }
        )

    except Exception as e:
        print(f"Error building table: {e}")

def run_ui():
    print("Welcome to the course catalog.\n\n")
    table = dynamodb.Table('Courses')
    search_done = False

    while not search_done:
        subject = None
        catalog_no = None
        next = None

        # Asking the user to provide course info until invalid input
        while not subject:
            subject = input("Please provide the subject (Three letter code) of your course: ")

            # Checking the range of values
            if len(subject) not in range(2,5):
                subject = None

        # Repeat catalog request until first invalid input
        while not catalog_no:
            try:
                catalog_no = int(input("Please enter the course number for your course: "))
            except Exception as e:
                print(f"Error gathering input: {e}")

        # Try loop to handle course search
        try:
            response = table.query(
                KeyConditionExpression=Key('Subject').eq(subject)
            )

            response = list(
                filter(lambda x: x['Num'] == catalog_no, response['Items'])
            )

            response_title = response[0]["Title"]

            print(f'The title of your selected course is: {response_title}')
        except Exception as e:
            print(f"Sorry, no matches found for these search criteria: {e} \n\n")


        # Process logic if they want to perform additional searches
        while next not in ["n","y"]:
            next = input("Would you like to look for another course? (Y or N)").lower()

            if next == "y":
                catalog_no = None
                subject = None
            elif next == "n":
                search_done = True
                print("\n\n Thank you for using the course catalog.")
                return
            else:
                pass
# Function to delete table
def delete_tbl():
    try:
        table = dynamodb.Table('Courses')
        table.delete()
    except Exception as e:
        print(f'Error deleting table: {e}')

if __name__ == "__main__":
    
    #Function to rebuild table

    run_ui()
        