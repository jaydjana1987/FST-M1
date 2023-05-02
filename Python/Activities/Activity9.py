# Enter Two List
lst1 = [5, 6, 7, 8]
lst2 = [10, 11, 12, 13, 14]

# Declare a third list that will contain the result
lst3 = []

# Get odd number from list1
for num in lst1:
    if (num % 2 != 0):
        lst3.append(num)

# Get Even number from list 2
for num in lst2:
    if (num % 2 == 0):
        lst3.append(num)

# Print result
print(f"First List is : {lst1}")
print(f"Second List is : {lst2}")
print(f"Third List is : {lst3}")

