#Chap 6, Q1
#Jihal Patel
#ICS4U0-A
#12 Feb 2018

##numInput = int(input("Enter a number to check whether it is prime: "))
##
##isPrime = True
##
##for i in range(2, numInput):
##    if numInput%i is 0:
##        isPrime = False
##
##if(isPrime):
##    print("The number is prime.")
##else:
##    print("The number is not prime.")

print("This program will print all prime numbers in between 2 numbers.")

num1 = int(input("Enter the lower number: "))
num2 = int(input("Enter the higher number: "))

for i in range(num1+1, num2):
    prime = True
    for j in range(2, i):
        if i%j is 0:
            prime = False
    if(prime and i is not 1):
        print(i)
