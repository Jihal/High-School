#Chap 6, Q3
#Jihal Patel
#ICS4U0-A
#13 Feb 2018

print("This program will tell you how long it will take for your investment to double")
initialAmount = int(input("Enter a investment you want doubled: "))

finalAmount = initialAmount*2
interestRate = float(input("Enter a interest rate in decimal: "))
years = 0

while(initialAmount<=finalAmount):
    years += 1
    initialAmount = (initialAmount*interestRate)+initialAmount

print("It will take", years, "years.")
                    
