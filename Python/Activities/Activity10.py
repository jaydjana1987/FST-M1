#Input Truple
myTuple=tuple(int(x.strip()) for x in input("Enter the values: \n").split(','))

print(f"Entered Tuple is: {myTuple}")

#print Number divisable by 5
print("Number divisable by 5 in Trupple is: ")
for x in myTuple:
    if (x % 5 == 0):
        print(x)

