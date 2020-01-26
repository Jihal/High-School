#Chap 5, Q1
#Jihal Patel
#ICS4U0-A
#07 Feb 2018

copies = int(input('Enter the number of copies to be printed: '))

if (copies>0 and copies<100):
    price = 0.30
    totalCost = copies*0.30
    print('Price per copy is: $%0.2f'%(price))
    print('Total cost is: $%0.2f'%(totalCost))
elif (copies>99 and copies<500):
    price = 0.28
    totalCost = copies*0.28
    print('Price per copy is: $%0.2f'%(price))
    print('Total cost is: $%0.2f'%(totalCost))
elif (copies>499 and copies<750):
    price = 0.27
    totalCost = copies*0.27
    print('Price per copy is: $%0.2f'%(price))
    print('Total cost is: $%0.2f'%(totalCost))
elif (copies>749 and copies<1001):
    price = 0.26
    totalCost = copies*0.26
    print('Price per copy is: $%0.2f'%(price))
    print('Total cost is: $%0.2f'%(totalCost))
elif (copies>1000):
    price = 0.25
    totalCost = copies*0.25
    print('Price per copy is: $%0.2f'%(price))
    print('Total cost is: $%0.2f'%(totalCost))
