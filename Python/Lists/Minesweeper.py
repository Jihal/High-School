#Minesweeper
#Jihal Patel
#765697
#ICS4U0-A
#20 Feb 2018

nAndm = [int(x) for x in input().split()] #Prompts user for n and m input
n = nAndm[0] #Initializes n to the n value inputed by the user
m = nAndm[1] #Initializes m to the m value inputed by the user
gameBoard=[] #Creates a list called gameboard
outputValues=[[] for i in range(n)]

for rowCount in range(nAndm[0]): #For loop for taking user's minesweeper board input
    line=[] #Creates a list called line
    rowInput = str(input()) #Prompts user for input at rowCount
    line.append(rowInput) #Adds user's input to the line list
    gameBoard.append(list(line[0])) #Seperates user's input and adds the seperated input to gameboard


for rowCount in range(len(gameBoard)): #For loop going through each of the rows of gameboard
    for colCount in range(len(gameBoard[rowCount])): #For loop going through each of the columns of gameboard
        
        totalStars = 0 #Initializes totalStars to 0 (Number of asterisks) 
        
        if gameBoard[rowCount][colCount]=="*": #If the element at the current row and column is a mine
            outputValues[rowCount].append("*") #Add an asterisk to the output values
            
        else: #If top condition is not met
            #If the asterisk is the at the top left corner adds one to the elements around:
            if rowCount is 0 and colCount is 0:
                if gameBoard[rowCount+1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount+1][colCount+1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount+1]=="*":
                    totalStars+=1
            #If the asterisk is the at the bottom left corner adds one to the elements around:        
            elif rowCount is n-1 and colCount is 0:
                if gameBoard[rowCount-1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount-1][colCount+1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount+1]=="*":
                    totalStars+=1
            #If the asterisk is in the first column but not top or bottom adds one to the elements around:        
            elif (rowCount is not n-1 and rowCount is not 0) and colCount is 0:
                if gameBoard[rowCount-1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount-1][colCount+1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount+1]=="*":
                    totalStars+=1
                if gameBoard[rowCount+1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount+1][colCount+1]=="*":
                    totalStars+=1
            #If the asterisk is the at the top right corner adds one to the elements around:        
            elif rowCount is 0 and colCount is m-1: 
                if gameBoard[rowCount+1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount+1][colCount-1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount-1]=="*":
                    totalStars+=1
            #If the asterisk is the at the bottom right corner adds one to the elements around:
            elif rowCount is n-1 and colCount is m-1: 
                if gameBoard[rowCount-1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount-1][colCount-1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount-1]=="*":
                    totalStars+=1
            #If the asterisk is the at the top row and not the first or last column adds one to the elements around:
            elif rowCount is 0 and (colCount is not 0 and colCount is not m-1): 
                if gameBoard[rowCount+1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount+1][colCount+1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount+1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount-1]=="*":
                    totalStars+=1
                if gameBoard[rowCount+1][colCount-1]=="*":
                    totalStars+=1
            #If the asterisk is the at the last row and not the first or last column adds one to the elements around:
            elif rowCount is n-1 and (colCount is not 0 and colCount is not m-1): 
                if gameBoard[rowCount][colCount-1]=="*":
                    totalStars+=1
                if gameBoard[rowCount-1][colCount-1]=="*":
                    totalStars+=1
                if gameBoard[rowCount-1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount-1][colCount+1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount+1]=="*":
                    totalStars+=1
            #If the asterisk is the at the last column and not the first or last row adds one to the elements around:
            elif (rowCount is not n-1 and rowCount is not 0) and colCount is m-1:
                if gameBoard[rowCount+1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount+1][colCount-1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount-1]=="*":
                    totalStars+=1
                if gameBoard[rowCount-1][colCount-1]=="*":
                    totalStars+=1
                if gameBoard[rowCount-1][colCount]=="*":
                    totalStars+=1
            #Checks for every other position (middle ones)
            else: 
                if gameBoard[rowCount-1][colCount-1]=="*":
                    totalStars+=1
                if gameBoard[rowCount-1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount-1][colCount+1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount+1]=="*":
                    totalStars+=1
                if gameBoard[rowCount+1][colCount+1]=="*":
                    totalStars+=1
                if gameBoard[rowCount+1][colCount]=="*":
                    totalStars+=1
                if gameBoard[rowCount+1][colCount-1]=="*":
                    totalStars+=1
                if gameBoard[rowCount][colCount-1]=="*":
                    totalStars+=1
                    
            outputValues[rowCount].append(totalStars) #Adds amount of total stars at current position to outputValues
            
for x in range(len(outputValues)): #Goes through all the rows of output values
    for y in range(len(outputValues[x])): #Goes through all the column at x row
        print(outputValues[x][y], end='') #Prints output values at the row and column xy
    print() #Goes to the next line
                
            
        

