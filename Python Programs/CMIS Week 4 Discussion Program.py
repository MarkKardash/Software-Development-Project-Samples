#This is a program that calculates the radius of a cone based on its volume

#Import the math module
import math

#Prompt the user to enter the value of the cone's volume

Volume = eval(input("Enter the cone's total volume:"))

#Prompt the user to enter the cone's height

Height = eval(input("Enter the cone's height:"))

#Because the formula for the volume of a cone is (1/3)*pi*r**2*h, we first
#multiply the total volume by 3

Solution_Stage_1 = Volume*3
print("Multiplying the volume by 3 gives us", Solution_Stage_1)

#Next, we simplify the equation further by getting rid of the height
#marked as variable "h" in the equation

Solution_Stage_2 = (Solution_Stage_1/Height)
print("Dividing by height gives us", Solution_Stage_2)

#We then get rid of the "pi" in the equation

Solution_Stage_3 = (Solution_Stage_2/math.pi)
print("The square of the radius is", Solution_Stage_3)

#Getting rid of pi leaves us with r**2, so all we need to do is find the radius
#by finding the square root.
Radius = math.sqrt(Solution_Stage_3)
print("The radius of the cone is", Radius)



