#Write a program that asks the user to enter their name and their age.
#Print out a message addressed to them that tells them the year that they will turn 100 years old.

name=input("What is your name: ")
age=int(input("What is your age: "))
year=str((2022-age)+100)

print("Hi "+name+",You will turn 100 in the the year of "+year)