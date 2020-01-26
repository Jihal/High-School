#Chapter 7, Q3
#Jihal Patel
#ICS4U0-A
#14 Feb 2018

def isPrime(numInput):
    for i in range(2, numInput):
        if numInput%i is 0:
            return False
        else:
            return True

numInputted = int(input("Enter a number the number you want to check if it is prime: "))

returnedValue = isPrime(numInputted)

if returnedValue:
    print("The number is prime.")
else:
    print("The number is not prime.")
