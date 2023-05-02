#Ask the user for a number.
#Depending on what number they enter, tell them if the number is an even or odd number.

number=int(input("Enter a Number: "))

if number%2==0:
    print("Entered number is even number")
else:
    print("Entered number is odd number")