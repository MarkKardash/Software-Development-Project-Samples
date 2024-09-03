print("This program determines the body-mass index of six people.")
#Create a list of six people for whom you are to calculate the mass
Mass_Calculation_Participants=["Josh","Shelby", "Michael", "Astrid", "Ethan","Jim"]
#Creating a list for the Body Mass Indices to go to when we calculate them
Body_Mass_Index_List=[]
#Create the function that will calculate the body mass index
def Body_Mass_Index(x,y):
    return x*703/y**(2)
#Make the program ask for each person's height and weight
for person in Mass_Calculation_Participants:
    print("Please input",person,"'s height (in inches):")
    Height=eval(input())
    print("Please input",person,"'s weight (in pounds):")
    Weight=eval(input())
#Use the function on each weight and height from each person
    Result=Body_Mass_Index(Weight,Height)
#Append every body mass index to the list created for them
    Body_Mass_Index_List.append(Result)
    print("The Body Mass Index for",person,"is:",Result)

#Create a function that will determine whether a person is of normal weight,
#overweight,or underweight
#The threshold for an underweight person is 18.5 and below
#The threshold for a person of normal weight is between 18.5 and 24.9
#The threshold for an overweight person is above 25
def Body_Mass_Category(x):
    if 18.5>x:
        return("underweight.")
    if 18.5<x<24.9:
        return("of normal weight.")
    if x>25:
        return("overweight.")
#Create a loop that will determine, based on each of the body mass indices, if
#the person is underweight, of normal weight, or overweight.
#Since this loop is independent from the loop with their names, we set
#up "count" to put numbers on the participants of the list. Because we will also
#use "count" later to actually count the people in each category, we name this
#one "count0" to distinguish it from the others.
count0=0
for number in Body_Mass_Index_List:
    Result2=Body_Mass_Category(number)
    count0=count0+1
    print("Participant",count0,"is",Result2)
#Create a loop to count the number of people in each aforementioned category
count=0
count2=0
count3=0
for number in Body_Mass_Index_List:
    if 18.5>number:
        count=count+1
    if 18.5<number<24.9:
        count2=count2+1
    if number>25:
        count3=count3+1
#For the final step,we place all of the print statements for the counting
#process right here
print("There are",count,"underweight people in this group.")
print("There are",count2,"people of normal weight in this group.")
print("There are",count3,"overweight people in this group.")



