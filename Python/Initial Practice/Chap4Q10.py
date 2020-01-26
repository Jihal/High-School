#Chap 4, Q10
#Jihal Patel
#ICS4U0-A
#07 Feb 2018

print('Enter your birthdate: ')
bornYear = int(input('Year: '))
bornMonth = int(input('Month: '))
bornDay = int(input('Day: '))
print("Enter today's date: ")
currentYear = int(input('Year: '))
currentMonth = int(input('Month: '))
currentDay = int(input('Day: '))

daysAlive = (currentYear - bornYear)*365 + (currentMonth-bornMonth)*30 + (currentDay-bornDay)
hoursSlept = daysAlive*8

print("You have been alive for", daysAlive, "days.")
print("You have slept", hoursSlept, "hours.")
