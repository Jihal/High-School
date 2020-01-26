#Chapter 7, Q1
#Jihal Patel
#ICS4U0-A
#14 Feb 2018

def addRoof():
    print(" "+" "+" "+"/\   ")
    print(" "+" "+"/  \  ")
    print(" "+"/    \ ")
    print("/______\ ")

def addBase():
    for i in range(0, 3):
        print("|      |")
    print("|______|")

def addWalk():
    print("   **  ")
    print("   **********")


addRoof()
addBase()
addWalk()
