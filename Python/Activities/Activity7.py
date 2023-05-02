#Declare Variable and take  number of element as input
numbers = []
n = int (input ("Enter number of elements: "))

# Iterate for n times take inputs
for i in range (n):
    x = int(input())
    numbers.append(x)
sum = 0

print(numbers)

for number in numbers:
    sum += int(number)

print(sum)