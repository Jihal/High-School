#Inheritance Test Question 2
#Jihal Patel
#765697
#ICS4U0-A
#April 23, 2018

class Stats:

    def __init__(self, points=0):
        self.points = points

    def overallPoints(self, gameStatus, numOfGames):
        if gameStatus == 'Win':
            self.points=self.points+(numOfGames*2)
        elif gameStatus == 'Loss':
            self.points=self.points+(numOfGames*0)
        elif gameStatus == 'Tie':
            self.points=self.points+(numOfGames*1)
        return self.points

class BasketballTeam(Stats):

    def __init__(self, gamesWon, gamesLost, gamesTied, points):
        self.gamesWon = gamesWon
        self.gamesLost = gamesLost
        self.gamesTied = gamesTied
        super().__init__(points)

    def setGamesWon(self, gameWins):
        self.gamesWon = gameWins
        super().overallPoints('Win', gameWins)
        return self.gamesWon

    def setGamesLost(self, gamesLoss):
        self.gamesLost = gamesLoss
        super().overallPoints('Loss', gamesLoss)

    def setGamesTied(self, tieGames):
        self.gamesTied = tieGames
        super().overallPoints('Tie', tieGames)

    def getGamesWon(self):
        return self.gamesWon

    def getGamesLost(self):
        return self.gamesLost

    def getGamesTied(self):
        return self.gamesTied

    def getPoints(self):
        return super().overallPoints("Loss", 0)
        
basketBall = BasketballTeam(0, 0, 0, 0)
basketBall.setGamesWon(4)
basketBall.setGamesLost(2)
basketBall.setGamesTied(1)
print("Overall Points:", basketBall.getPoints())
print("Games Won:", basketBall.getGamesWon())
print("Games Lost:", basketBall.getGamesLost())
print("Games Tied:", basketBall.getGamesTied())

