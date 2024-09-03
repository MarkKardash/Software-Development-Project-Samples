#Print the purpose of the program
print("This program will calculate the price of purchases when a 25% sale is at"
      " the store.")
#Create the list needed
Product_Price=[]
#Prompt the user for the price of their purchases
price=eval(input("Please Enter Your Purchase Price (in $) (Enter -1 To Exit):"))
#Set up a "while" and "for" loop for the discount to be applied
while (price!=-1):
    Product_Price.append(int(price))
    price=eval(input("Please Enter Your Purchase Price (in $) (Enter -1 To Exit):"))
for i in range(len(Product_Price)):
    Product_Price[i] = Product_Price[i]-((Product_Price[i]*25)/100)
#Print the new prices with the discount applied
print("Your new product prices with our discount are:", Product_Price)
#For the last step, calculate the sum of all prodct prices with discount
Total_Price=sum(Product_Price)
print("Your total purchase price is:", Total_Price)
    
