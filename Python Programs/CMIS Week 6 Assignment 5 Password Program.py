#Print the purpose of this program
print("This program determines whether a password is valid or invalid.")
#Prompt the user for the candidate password
print("Please enter your password:")
password=input()
#Setting up strings to find and eliminate any combination of "umgc" in password
substring="umgc"
if substring in password:
    print("Password cannot contain college name. Please try again.")
substring2="UMGC"
if substring2 in password:
    print("Password cannot contain college name. Please try again.")
substring3="Umgc"
if substring3 in password:
    print("Password cannot contain college name. Please try again.")
substring4="UMgc"
if substring4 in password:
    print("Password cannot contain college name. Please try again.")
substring5="UMGc"
if substring5 in password:
    print("Password cannot contain college name. Please try again.")
substring6="uMGC"
if substring6 in password:
    print("Password cannot contain college name. Please try again.")
substring7="umGC"
if substring7 in password:
    print("Password cannot contain college name. Please try again.")
substring8="umgC"
if substring8 in password:
    print("Password cannot contain college name. Please try again.")
substring9="uMgc"
if substring9 in password:
    print("Password cannot contain college name. Please try again.")
substring10="uMGc"
if substring10 in password:
    print("Password cannot contain college name. Please try again.")
substring11="UmgC"
if substring11 in password:
    print("Password cannot contain college name. Please try again.")
substring12="UMgc"
if substring12 in password:
    print("Password cannot contain college name. Please try again.")
#Setting up some "if" statements to make sure the password is valid
if 7>len(password):
    print("Password must be at least 7 (Seven) characters. Please try again.")
if 12<len(password):
    print("Password cannot exceed 12 (Twelve) characters. Please try again.")
res=password.find("#")
character="#"
if 7<=len(password)<=12 and substring not in password:
    print("Password created successfully.")

    


    




res=password.find("umgc" and "UMGC" and "Umgc")

