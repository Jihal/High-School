#Inheritance Test 1
#Jihal Patel
#765697
#April 23, 2018

class Stats:
    def __init__(self, points):
        self.points=points

    def totalPoints(self, games, teamGame):
        if(teamGame is 'lost'):
            self.points=self.points
        elif(teamGame is 'won'):
            self.points=self.points+(games*2)
        elif(teamGame is 'tied'):
            self.points=self.points+(games*1)
        return self.points
    
class basketballTeam(Stats):
    def __init__(self, points, winGames, lostGames, tiedGames):
        self.winGames = winGames
        self.lostGames = lostGames
        self.tiedGames = tiedGames
        super().__init__(points)

    def setGameWins(self, wins):
        self.winGames = wins
        super().totalPoints('won', wins)

    def setGameLosses(self, losses):
        self.lostGames = losses
        super().totalPoints('lost', losses)

    def setGameTied(self, tied):
        self.tieGames = tied
        super().totalPoints('tied', tied)

    def __repr__(self):
        return "{}\n Games Won: %.0f\n Games Tied: %.0f\n Games Lost: %.0f".format(super().totalPoints('lost',0))%(self.winGames,self.tiedGames,self.lostGames)

team = basketballTeam(0, 0, 0, 0)    
team.setGameWins(3)
team.setGameLosses(2)
team.setGameTied(2)
print(team)
