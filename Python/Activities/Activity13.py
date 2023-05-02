# Define function to calculate Sum
def cal_sum(numbers):
    sum = 0
    for number in numbers:
        sum += number
    return sum


#Declare Variable and take  number of element as input
myLst = []
n = int (input ("Enter number of elements: "))

# Iterate for n times take inputs
for i in range (n):
    x = int(input())
    myLst.append(x)


result = cal_sum(myLst)

# Print Result
print("Sum of all element in the entered list is : " + str(result))