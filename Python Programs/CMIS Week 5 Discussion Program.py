print("This is a program that calculates money in a bank after subtraction"
"of a monthly fee of $4, as long as the amount is above $155")
#Prompt the user to enter the amount deposited in the bank
print("Please enter the cash amount you have deposited (In US Dollars):")
cash = int(input())
#Create the "While" loop needed for the program to subtract the $4
while cash > 155: 
#Set up the "print" statement to work for each iteration
    print(cash)
#Set up the statement that subtracts the fee and decrements the money
    cash=cash-4
      
