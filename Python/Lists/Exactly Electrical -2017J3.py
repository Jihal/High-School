#Exactly Electrical [2017-J3]
#Jihal Patel
#765697
#ICS4U0-A
#26 Feb 2018

#Not working at the moment

startCoor = [int(x) for x in input().split()]
endCoor = [int(x) for x in input().split()]
charges = int(input())

if startCoor[0] is not endCoor[0]:
    if startCoor[0] > endCoor[0]:
        while((startCoor[0] is not endCoor[0]) or (charges is not 0)):
            startCoor[0] = startCoor[0]-1
            charges = charges-1
    elif startCoor[0] < endCoor[0]:
        while((startCoor[0] is not endCoor[0]) or (charges is not 0)):
            startCoor[0] = startCoor[0]+1
            charges = charges-1

    if(charges==0 and startCoor[0] is not endCoor[0]):
        print("N")

elif(charges is not 0 and startCoor[0] is endCoor[0]):
    if startCoor[1] > endCoor[1]:
        while((startCoor[1] is not endCoor[1]) or (charges is not 0)):
            startCoor[1] = startCoor[1]-1
            charges = charges-1
    elif startCoor[1] < endCoor[1]:
        while((startCoor[1] is not endCoor[1]) or (charges is not 0)):
            startCoor[1] = startCoor[1]+1
            charges = charges-1
    elif(startCoor[1] is endCoor[1] and charges is not 0):
        while(charges is not 0):
            if(startCoor[1] is endCoor[1]):
                startCoor[1] = startCoor[1]+1
                charges = charges-1
            elif(startCoor[1] > endCoor[1]):
                startCoor[1]=startCoor[1]-1
                charges = charges-1
    elif(charges is 0 and startCoor[1] is not endCoor[1]):
        print("N")
    elif(charges is 0 and startCoor[1] is endCoor[1]):
        print("Y")
