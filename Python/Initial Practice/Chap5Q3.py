#Chap 5, Q3
#Jihal Patel
#ICS4U0-A
#07 Feb 2018

import math
eggs = int(input('Enter the number of eggs purchased: '))
extraEggs = eggs%12
dozen = math.trunc(eggs/12)

if(0<dozen<4):
    dozenPrice = dozen*0.50
    extraPrice = (extraEggs/12)*0.50
    totalPrice = dozenPrice+extraPrice
    print('The bill is equal to: $%0.2f' %(totalPrice))
elif(4<dozen<6):
    dozenPrice = dozen*0.45
    extraPrice = (extraEggs/12)*0.45
    totalPrice = dozenPrice+extraPrice
    print('The bill is equal to: $%0.2f' %(totalPrice))
elif(6<dozen<11):
    dozenPrice = dozen*0.40
    extraPrice = (extraEggs/12)*0.40
    totalPrice = dozenPrice+extraPrice
    print('The bill is equal to: $%0.2f' %(totalPrice))
elif(11<dozen):
    dozenPrice = dozen*0.35
    extraPrice = (extraEggs/12)*0.35
    totalPrice = dozenPrice+extraPrice
    print('The bill is equal to: $%0.2f' %(totalPrice))
