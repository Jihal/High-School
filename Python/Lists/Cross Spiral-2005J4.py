#Cross Spiral [2005-J4]
#Jihal Patel
#765697
#ICS4U0-A
#21 Mar 2018

inWid = int(input())
inLen = int(input())
cutWid = int(input())
cutLen = int(input())
steps = int(input())
board=[]
emptySpots = 0

for rowCount in range(inLen):
    row=[]
    for colCount in range(inWid):
        row.append('[ ]')
    board.append(row)

for rowCount in range(len(board)):
        for colCount in range(len(board[rowCount])):
            if colCount <= cutWid-1:
                if rowCount <= cutLen-1:
                    board[rowCount][colCount] = "[X]"
            if colCount >= inWid-cutWid:
                if rowCount <= cutLen-1:
                    board[rowCount][colCount] = "[X]"
            if colCount <= cutWid-1:
                if rowCount >= inLen-cutLen:
                    board[rowCount][colCount] = "[X]"
            if colCount >= inWid-cutWid:
                if rowCount >= inLen-cutLen:
                    board[rowCount][colCount] = "[X]"
            print(board[rowCount][colCount],end='')
        print()
        
for rowCount in range(len(board)):
        for colCount in range(len(board[rowCount])):
            if board[rowCount][colCount] is not "[X]":
                emptySpots+=1
                
print(emptySpots)

rowNum = 0
colNum = cutWid
stepsUsed = 0

while(emptySpots is not 0):
##    if board[rowNum][colNum] is not "[X]":
        board[rowNum][colNum] = stepsUsed
        stepsUsed+=1
        emptySpots-=1
        if board[rowNum][colNum+1]==False and board[rowNum+1][colNum]:
            rowNum+=1
        elif board[rowNum][colNum+1]:
            colNum+=1
        
            


            
