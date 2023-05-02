def recursiveSum(num):
    if num:
        return num + recursiveSum(num-1)
    else:
        return 0

# Call recursiveSum function
inputnum=int(input("Enter a number: "))
res = recursiveSum(inputnum)

# Print the result
print(f"The recursive function result of {inputnum} is {res}")