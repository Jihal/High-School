#Chap 6, Q4
#Jihal Patel
#ICS4U0-A
#13 Feb 2018

modelNumber = 1

while(modelNumber is not 0):
    modelNumber = int(input("Enter the car's model number or 0 to quit: "))
    if modelNumber == 0:
        break
    if(modelNumber==119 or modelNumber==179 or 188<modelNumber<196 or modelNumber==221 or modelNumber==780):
        print("Your car is defective. It must be repaired.")
    else:
        print("Your car is not defective.")
