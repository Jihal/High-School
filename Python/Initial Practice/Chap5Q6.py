#Chap 5, Q6
#Jihal Patel
#ICS4U0-A
#08 Feb 2018

import random

randomNum1 = random.randint(1, 10)
randomNum2 = random.randint(1, 10)
operator = 3##random.randint(1, 4)

if(operator==1):
    answer = int(input('What is '+str(randomNum1)+' + '+str(randomNum2)+'? '))
    if(answer==randomNum1+randomNum2):
        print('Correct!')
    else:
        print('Incorrect! The correct answer is:', randomNum1+randomNum2)

elif(operator==2):
    answer = int(input('What is '+str(randomNum1)+' - '+str(randomNum2)+'? '))

    if(answer==randomNum1-randomNum2):
        print('Correct!')
    else:
        print('Incorrect! The correct answer is:', randomNum1-randomNum2)

elif(operator==3):
    while(randomNum1%randomNum2 is not 0):
        randomNum1 = random.randint(1, 10)
        randomNum2 = random.randint(1, 10) 

    answer = int(input('What is '+str(randomNum1)+' / '+str(randomNum2)+'? '))

    if(answer==randomNum1/randomNum2):
        print('Correct!')
    else:
        print('Incorrect! The correct answer is:', (randomNum1//randomNum2))

elif(operator==4):
    answer = int(input('What is '+str(randomNum1)+' * '+str(randomNum2)+'? '))

    if(answer==randomNum1*randomNum2):
        print('Correct!')
    else:
        print('Incorrect! The correct answer is:', randomNum1*randomNum2)


