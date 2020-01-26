#Minesweeper Shorter Version
#Jihal Patel
#765697
#ICS4U0-A
#20 Feb 2018

nAndm = [int(x) for x in input().split()]
n = nAndm[0]
m = nAndm[1]
gameBoard=[]
rowAndcol=[]
indexOfStar=[]
outputValues=[[] for i in range(n)]

for rowCount in range(nAndm[0]):
    line=[]
    rowInput = str(input())
    line.append(rowInput)
    gameBoard.append(list(line[0]))
print(gameBoard)

for rowCount in range(len(gameBoard)):
    for colCount in range(len(gameBoard[rowCount])):
        if(gameBoard[rowCount][colCount]=="*"):
            rowAndcol=[rowCount, colCount]
            indexOfStar.append(rowAndcol)

for rowCount in range(len(gameBoard)):
    for colCount in range(len(gameBoard[rowCount])):
        if(gameBoard[rowCount][colCount]=="*"):
            outputValues[rowCount].append("*")
        else:
            add=[]
            totalStars = 0
            for i in range(len(indexOfStar)):
                if(indexOfStar[i][0]-1 <= rowCount) and (indexOfStar[i][0]+1 >= rowCount):
                    if(indexOfStar[i][1]-1 <= colCount) and (indexOfStar[i][1]+1 >= rowCount):
                        add.append(1)
                    else:
                        add.append(-1)
                else:
                    add.append(-1)
            for adding in range(len(add)):
                if(add[adding]>0):
                    totalStars+=1
                    
            outputValues[rowCount].append(totalStars)

for x in range(len(outputValues)): #Goes through all the rows of output values
    for y in range(len(outputValues[x])): #Goes through all the column at x row
        print(outputValues[x][y], end='') #Prints output values at the row and column xy
    print() #Goes to the next line
                    
                         
                          
        
            
