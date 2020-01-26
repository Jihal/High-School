#Euclid's Algorithm Exam Q1
#Jihal Patel
#765697
#ICS4U0-A
#14 June 2018

def gcd(number1, number2, num2_const):                                                                    #Creates function gcd with the parameters of the 2 numbers and constant value for number 2
    if(number1%number2 is 0 and num2_const%number2 is 0):                                                 #Checks if remainder from number 1 and 2 is 0 and the remainder from the constant number 2 and changing number 2 is 0
        return number2                                                                                    #If above condition is met return the constant number 2 since that is the greatest common divisor
    else:                                                                                                 #If the previous condition is not met
        return gcd(number1, number2-1, num2_const)                                                        #Return the function causing the function to run again with a lower test value for the divisor as number 2

num1 = int(input("Enter number 1: "))                                                                     #Prompts user for number 1
num2 = int(input("Enter number 2: "))                                                                     #Prompts user for number 2

if num1 > num2:                                                                                           #Checks if number 1 is greater then number 2 to keep higher number first in gcd function
    print("The greatest common divisor between", num1, "and", num2, "is", str(gcd(num1, num2, num2))+'.') #Prints greatest common divisor between the functions by running the gcd function (higher number as num 1)
else:                                                                                                     #If number 1 is not greater then number 2, then set num2 as the first number in the gcd function
    print("The greatest common divisor between", num1, "and", num2, "is", str(gcd(num2, num1, num1))+'.') #Prints greatest common divisor between the functions by running the gcd function (higher number as num 1)
