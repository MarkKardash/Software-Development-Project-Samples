#Program calculating the passenger capacity limit of a small river cruise ship
#Passenger capacity of supposed ship cannot exceed 75
#Prompt for number of passengers boarding at Departure Port:
print("Please enter number of passengers boarding at Departure Port:")
Departure_Port = eval(input())

#Prompt for number of passengers boarding at First Stop Port:

print("Please enter number of passengers boarding at First Stop Port:")

First_Stop_Port = eval(input())

#Prompt for number of passengers boarding at Second Stop Port:

print("Please enter number of passengers boarding at Second Stop Port:")

Second_Stop_Port = eval(input())

#Use "if" statements to control the capacity of the ship

if(Departure_Port+First_Stop_Port+Second_Stop_Port)>75:
    print("Over capacity. Advised to return.")
elif(Departure_Port+First_Stop_Port+Second_Stop_Port)<75:
    print("Under capacity.Safety in check.")
elif(Departure_Port+First_Stop_Port+Second_Stop_Port)==75:
    print("Full capacity. Smooth sailing")

    

