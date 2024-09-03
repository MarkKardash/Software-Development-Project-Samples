#Mark Kardash
#Professor Nathan Braun
#SDEV400 6381 Secure Programming In The Cloud
#Date: 23 January 2024

import boto3 #Importing boto3
import pathlib #Importing pathlib to get full path of file
from datetime import datetime #Importing datetime function
from pytz import timezone #Importing timezone function
import os #Importing os to read full file path

while (True): #While loop with main menu
        print("Welcome to our Bucket Creation App!")
        print("Main menu:")
        print("1: Create bucket (format: firstnamelastname-000000")
        print("2: Place object in bucket")
        print("3: Delete object from bucket")
        print("4: Copy object between buckets")
        print("5: Download object from bucket")
        print("6: Exit program")


        print("Please enter your selection: ") #User prompt
        user_choice = int(input())
            
        s3 = boto3.client('s3') #Making a boto3 client
        time_zone = timezone('EST') #Specifying timezone
        current_time = datetime.now(time_zone) #Setting current time
        date_and_time = current_time.strftime("%m/%d/%Y %H:%M:%S") #Setting format of current time
        bucket_name = 'markkardash-409175' #Setting name of original bucket
        KEY = 'SDEV400HW1SampleFile.txt' #Setting name of text file
    

        if user_choice == 1: #If loop to execute options
            s3.create_bucket(Bucket = bucket_name)
            print('\nBucket ', bucket_name,' created successfully')
        

        if user_choice == 2:
            current_directory = os.getcwd()
            file = 'SDEV400HW1SampleFile.txt'
            file_name = os.path.join(current_directory, 'SDEV400Homework1MarkKardash/files', file)
            files = open(file_name, 'rb') #Adding 'rb' in case of error
            s3.upload_file(file_name, bucket_name, file)
            print('\nObject', file, ' has been successfully added to bucket ', bucket_name)

        if user_choice == 3:
            file_name = 'SDEV400HW1SampleFile.txt'
            s3.delete_object(Bucket=bucket_name, Key=file_name)
            print('\nObject', file_name,'has been successfully deleted from bucket', bucket_name)

        if user_choice == 4:
            copy_to_bucket = 'bucket1markkardash'
            copy_to_file = 'SDEV400SampleFileToCopy.txt'
            s3 = boto3.resource('s3')
            s3.Object(copy_to_bucket, copy_to_file).copy_from(CopySource = 'markkardash-409175/SDEV400HW1SampleFile.txt') #Placing file directory
            print('\nObject ', copy_to_file, 'has been successfully copied to bucket ', copy_to_bucket)

        if user_choice == 5:
                s3 = boto3.resource('s3')
                bucket_name = 'markkardash-409175'
                KEY = 'SDEV400HW1SampleFile.txt'
                save_as = 'SDEV400HW1SampleFile-download.txt'
                s3.Bucket(bucket_name).download_file(KEY, save_as)
                print('\nYou have successfully downloaded file ', KEY,' from bucket', bucket_name, ' which has been saved as ', save_as)
            

        if user_choice == 6:
            print("Thank you for using our application!")
            print(date_and_time)
            break
        
        elif user_choice>6: # Option for invalid choice

            print("\r\n###############################6###############\r\n"
                " * Sorry! You have entered an invalid choice!* "
                " \r\n##############################################\r\n ")
