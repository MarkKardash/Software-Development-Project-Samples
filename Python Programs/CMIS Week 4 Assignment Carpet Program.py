#Prompt the user for the lenght(in feet) of the room
Length = eval(input("Please enter the length of your room:"))
#Prompt the user for the width (in feet) of the room
Width = eval(input("Please enter the width of your room:"))
#Prompt the user for the quality of carpet they want
Carpet_Quality = input("Please enter the quality of carpet you desire:")
#Set prices for one square foot of each grade of carpet quality (in $)
Standard_Carpet = 5
Extra_Soft_Carpet = 15
DeLuxe_Carpet = 35
#Creating the function "Determine Price" to calculate carpeting price
def Determine_Price (x, y, Carpet_Quality):
    Carpeting_Price = x*y*Carpet_Quality
#Setting some rules to calculate price based on the possible imput of the user
    if Carpet_Quality=="Standard Carpet":
        print ("The Carpeting Price is", x*y*5)
    elif Carpet_Quality=="Extra Soft Carpet":
        print ("The Carpeting Price is", x*y*15)
    elif Carpet_Quality=="DeLuxe Carpet":
        print ("The Carpeting Price is", x*y*35)
    
Determine_Price (Length, Width, Carpet_Quality)

    
