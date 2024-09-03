#This is a proram that calculates the total points earned by a player at a game

#Prompt user for their first name
print("Please enter your first name\n")
First_Name = input("Player First Name: ")

#Prompt user for their last name
print("Please enter your last name\n")
Last_Name = input("Player Last Name: ")
#Prompt user for points received in the first round:
print("Please enter points received during first roound\n")
First_Round_Points= eval(input("Round One Points: "))

#Prompt user for points received in the second round:
print("Please enter points received during second round\n")
Second_Round_Points= eval(input("Round Two Points: "))

#Calculate total of points in two rounds
Total_Game_Points= First_Round_Points+Second_Round_Points
print("Your Total Game Points Are: ", Total_Game_Points)





