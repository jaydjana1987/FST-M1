#Declare fruit disctionary
fruits = {
    "melon":20,
    "apple":100,
    "orange":70
}

# Verify fruit is available or not
fruit_check = input("Pleas enter fruit you want: ").lower()
if(fruit_check in fruits):
    print("Entered friut is available")
else:
    print("Entered friut isn't available")