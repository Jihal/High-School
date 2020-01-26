#Tic Tac Toe
#Jihal Patel
#765697
#ICS4U0-A
#28 Feb 2018

xTurn = True
winX = False
winO = False
spaces = 9
tt_board=[]
for row_count in range(3):
    row=[]
    for col_count in range(3):
        row.append('[ ]')
    tt_board.append(row)

print(tt_board)

def display_board():
    for row_count in range(len(tt_board)):
        for col_count in range(len(tt_board[row_count])):
            print(tt_board[row_count][col_count],end='')
        print()

while(winX==False and winO==False and spaces>0):
    display_board()
    
    rowNum = int(input('Enter row number (0, 1, 2): '))
    colNum = int(input('Enter column number (0, 1, 2): '))

    def available(row, col):
        if tt_board[row][col]=='[ ]':
            return True
        else:
            return False
    check=available(rowNum, colNum)
    
    if(check):
        if xTurn:
            tt_board[rowNum][colNum]='[X]'
            xTurn = False
            spaces-=1
        else:
            tt_board[rowNum][colNum]='[O]'
            xTurn = True
            spaces-=1
    else:
        print("That spot is taken")

    ##Checking for X horiztonal wins:
    if(tt_board[0][0]=='[X]' and tt_board[0][1]=='[X]' and tt_board[0][2]=='[X]'):
        winX = True
    elif(tt_board[1][0]=='[X]' and tt_board[1][1]=='[X]' and tt_board[1][2]=='[X]'):
        winX = True
    elif(tt_board[2][0]=='[X]' and tt_board[2][1]=='[X]' and tt_board[2][2]=='[X]'):
        winX = True
    ##Checking for X vertical wins: 
    elif(tt_board[0][0]=='[X]' and tt_board[1][0]=='[X]' and tt_board[2][0]=='[X]'):
        winX = True
    elif(tt_board[0][1]=='[X]' and tt_board[1][1]=='[X]' and tt_board[2][1]=='[X]'):
        winX = True
    elif(tt_board[0][2]=='[X]' and tt_board[1][2]=='[X]' and tt_board[2][2]=='[X]'):
        winX = True
    ##Checking for X diagonal wins: 
    elif(tt_board[0][0]=='[X]' and tt_board[1][1]=='[X]' and tt_board[2][2]=='[X]'):
        winX = True
    elif(tt_board[0][2]=='[X]' and tt_board[1][1]=='[X]' and tt_board[2][0]=='[X]'):
        winX = True

    ##Checking for O horiztonal wins:
    if(tt_board[0][0]=='[O]' and tt_board[0][1]=='[O]' and tt_board[0][2]=='[O]'):
        winO = True
    elif(tt_board[1][0]=='[O]' and tt_board[1][1]=='[O]' and tt_board[1][2]=='[O]'):
        winO = True
    elif(tt_board[2][0]=='[O]' and tt_board[2][1]=='[O]' and tt_board[2][2]=='[O]'):
        winO = True
    ##Checking for O vertical wins: 
    elif(tt_board[0][0]=='[O]' and tt_board[1][0]=='[O]' and tt_board[2][0]=='[O]'):
        winO = True
    elif(tt_board[0][1]=='[O]' and tt_board[1][1]=='[O]' and tt_board[2][1]=='[O]'):
        winO = True
    elif(tt_board[0][2]=='[O]' and tt_board[1][2]=='[O]' and tt_board[2][2]=='[O]'):
        winO = True
    ##Checking for O diagonal wins: 
    elif(tt_board[0][0]=='[O]' and tt_board[1][1]=='[O]' and tt_board[2][2]=='[O]'):
        winO = True
    elif(tt_board[0][2]=='[O]' and tt_board[1][1]=='[O]' and tt_board[2][0]=='[O]'):
        winO = True

if(winX):
    display_board()
    print("Winner is X")
if(winO):
    display_board()
    print("Winner is O")
if(spaces==0 and winX==False and winO==False):
    display_board()
    print("Game over! Tie!")


