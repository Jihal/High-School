#Chap 5, Q9
#Jihal Patel
#ICS4U0-A
#08 Feb 2018

import random

computerNum = random.randint(1, 20)
playerNum = int(input('Enter a number between 1 and 20: '))

print("Computer's Number:", computerNum)
print("Player's Number:", playerNum)

if(computerNum==playerNum):
    print('You won!')
else:
    print('Better luck next time.')
