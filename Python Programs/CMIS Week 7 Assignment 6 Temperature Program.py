#Create the list for the temperature in Celsius
Temperature_In_Celsius=[]
#Set a variable "n" for the program to count the days
n=1
#Prompt the user for the temperature in celsius
#Set up a "while" loop for it to keep going
while n<=10:
    print("Please enter Day",n,"temperature in Celsius.")
    TempInC=eval(input())
    Temperature_In_Celsius.append(TempInC)
    n=n+1
print("The Temperature, in C, for the next 10 days is:", Temperature_In_Celsius)
#Next, we count all the cool, warm and hot days. It is very important that we
#do it before conversion to Fahrenheit, so we put them here. We will put the
#"print" statements at the bottom of the program so that it's the last thing
#it prints.
#Cool days have temperatures between 10 and 19 Celsius.
#Warm days have temperatures between 20 and 25 Celsius.
#Hot days have temperatures from 26 Celsius and up.
count=0
for value in Temperature_In_Celsius:
    if 10<=value<=19:
        count=count+1
count2=0
for value in Temperature_In_Celsius:
    if 20<=value<=25:
        count2=count2+1
count3=0
for value in Temperature_In_Celsius:
    if value>=26:
        count3=count3+1
#Set up a "for" loop to convert your temperatures from Celsius to Fahrenheit
for i in range(len(Temperature_In_Celsius)):
    Temperature_In_Celsius[i]=(Temperature_In_Celsius[i]*1.8)+32
#Print the new, converted list of temperatures
print("The Temperature, in F, for the next 10 days is:", Temperature_In_Celsius)
#Finally, we put all "print" statements for the cool, warm and hot days here
print("There will be",count,"cool days in this time period.")
print("There will be",count2,"warm days in this time period.")
print("There will be",count3,"hot days in this time period.")


