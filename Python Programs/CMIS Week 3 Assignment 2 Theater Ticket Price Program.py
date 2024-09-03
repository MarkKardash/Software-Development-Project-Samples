#Prompt the user for their age
print("Please enter your age:")
Age = eval(input())

#Prompt the user to answer if the movie is in 3D
print("Are you watching a 3D film?")
Three_D_Film = input()

#Setting the 3D film surcharge to $2.50

Three_D_Film_Surcharge = 2.50

#Setting the price for non-senior adults to $10.50

Price_For_Non_Senior_Adults = 10.50

#Setting the discount for seniors to $4, and for children to $5
Senior_Discount_Amount = 4
Child_Discount_Amount = 5

#Using "if" statements, calculate the price for non-senior adults (Ages 18-59) for a non-3D film
if 18<Age<60 and Three_D_Film=="No":
    print("The price of an adult non-3D ticket is:", Price_For_Non_Senior_Adults)
#Using "if" statements, calculate the price for non-senior adults for a 3D film
elif 18<Age<60 and Three_D_Film=="Yes":
    print("The price of an adult 3D ticket is:",Price_For_Non_Senior_Adults+Three_D_Film_Surcharge)
#Using "if" statements, calculate the price for children (Age 18 and below) for a non-3D film
if Age<18 and Three_D_Film=="No":
    print("The Price of a Child Non-3D Ticket is:", Price_For_Non_Senior_Adults-Child_Discount_Amount)
#Using "if" statements, calculate the price for children for a 3D film
elif Age<18 and Three_D_Film=="Yes":
    print("The Price of a Child 3D Ticket is:", (Price_For_Non_Senior_Adults-Child_Discount_Amount)+Three_D_Film_Surcharge)
#Using "if" statements, calculate the price for seniors (Ages 60 and above) for a non-3D film
if Age>60 and Three_D_Film=="No":
    print("The Price of a Senior Non-3D Ticket is:", Price_For_Non_Senior_Adults-Senior_Discount_Amount)
#Using "if" statements, calculate the price for seniors for a 3D film
elif Age>60 and Three_D_Film=="Yes":
    print("The Price of a Senior 3D Ticket is:", (Price_For_Non_Senior_Adults-Senior_Discount_Amount)+Three_D_Film_Surcharge)


    

