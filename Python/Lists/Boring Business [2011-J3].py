#Boring Business [2011-J4]
#Jihal Patel
#765697
#ICS4U0-A
#22 Mar 2018

position = [-1, -5]
dangerPositions = [[0, -1], [0, -2], [0, -3], [1, -3], [2, -3], [3, -3], [3, -4], [3, -5], [4, -5], [5, -5], [5, -4], [5, -3], [6, -3], [7, -3], [7, -4], [7, -5], [7, -6], [7, -7], [6, -7], [5, -7], [4, -7], [3, -7], [2, -7], [1, -7], [0, -7], [-1, -7], [-1, -6], [-1, -5]]
done = False

while(done == False):
    danger = False
    move = input()
    move = move.split()
    
    if(move[0] == 'q'):
        done == True
        break
    
    elif(move[0] == 'l'):
        for i in range(int(move[1])):           
            position[0]-=1
            dangerPositions.append(position[:])           
        updatedPosition = position       
    elif(move[0] == 'd'):
        for i in range(int(move[1])):
            position[1]-=1
            dangerPositions.append(position[:])
        updatedPosition = position
    elif(move[0] == 'r'):
        for i in range(int(move[1])):
            position[0]+=1
            dangerPositions.append(position[:])
        updatedPosition = position
    elif(move[0] == 'u'):
        for i in range(int(move[1])):
            position[1]+=1
            dangerPositions.append(position[:])
        updatedPosition = position

    check = dangerPositions.copy()
    
    for items in dangerPositions:
        for checkItems in check:
            if checkItems == items:
                danger = True
            
                
    print(dangerPositions)
    print(check)
    if danger==True:
        print(position[0], position[1], "DANGER")
        done = True
    else:
        print(position[0], position[1], "safe")
            
            

    

