#Chap 10, Q13 Penny Pitch
#Jihal Patel
#765697
#ICS4U0-A
#28 Feb 2018

import random  ##To use random do: random.randint(1, 10) range between 1-10

gameBoard = []

for rowCount in range(5):
    row = []
    for rowAddition in range(5):
        row.append('[      ]')
    gameBoard.append(row)

def displayBoard():
    prizes = 0
    puzzle = 0
    game = 0
    ball = 0
    poster = 0
    doll = 0
    
    while(prizes<15):
        rowNum = random.randint(0, 4)
        colNum = random.randint(0, 4)
        prize = random.randint(0, 4)

        if gameBoard[rowNum][colNum] == '[      ]':
            if prize==0 and puzzle<3:
                gameBoard[rowNum][colNum] = '[PUZZLE]'
                puzzle+=1
                prizes+=1
            elif prize==1 and game<3:
                gameBoard[rowNum][colNum] = '[ GAME ]'
                game+=1
                prizes+=1
            elif prize==2 and ball<3:
                gameBoard[rowNum][colNum] = '[ BALL ]'
                ball+=1
                prizes+=1
            elif prize==3 and poster<3:
                gameBoard[rowNum][colNum] = '[POSTER]'
                poster+=1
                prizes+=1
            elif prize==4 and doll<3:
                gameBoard[rowNum][colNum] = '[ DOLL ]'
                doll+=1
                prizes+=1

    for rowCount in range(len(gameBoard)):
        for colCount in range(len(gameBoard[rowCount])):
            print(gameBoard[rowCount][colCount], end=' ')
        print()

    pennies = 0

    while(pennies<10):
        rowNum = random.randint(0, 4)
        colNum = random.randint(0, 4)
        if gameBoard[rowNum][colNum] == '[PUZZLE]':
            puzzle-=1
        elif gameBoard[rowNum][colNum] == '[ GAME ]':
            game-=1
        elif gameBoard[rowNum][colNum] == '[ BALL ]':
            ball-=1
        elif gameBoard[rowNum][colNum] == '[ POSTER ]':
            poster-=1
        elif gameBoard[rowNum][colNum] == '[ DOLL ]':
            doll-=1
        pennies+=1

    print("Prizes won: ")
    
    if(puzzle==0):
        print("Puzzle")
    if(game==0):
        print("Game")
    if(ball==0):
        print("Ball")
    if(poster==0):
        print("Poster")
    if(doll==0):
        print("Doll")
    if(puzzle!=0 and game!=0 and ball!=0 and poster!=0 and doll!=0):
        print("None")
       
displayBoard()
