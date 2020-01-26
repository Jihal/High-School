#Factorial Recursion
#Jihal Patel
#765697
#ICS4U0-A
#June 11, 2018

def factorial(num):

    if num == 0:
        return 1

    else:
        return num*factorial(num-1)
    

num = int(input("Number: "))
print(factorial(num))
