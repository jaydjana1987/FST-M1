#Declare Variable and take  number of element as input
myLst = []
n = int (input ("Enter number of elements: "))

# Iterate for n times take inputs
for i in range (n):
    x = int(input())
    myLst.append(x)

# Print the list
print("List:", myLst)

# Get first element in list
firstElement = myLst[0]

# Get last element in list
lastElement = myLst[-1]

# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)