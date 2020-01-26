#Coin Class
#Jihal Patel
#765697
#ICS4U0-A
#March 27, 2018

from secrets import randbelow

class Coin:

    def __init__(self, var):
        self.variable = var

    def getFace(self):
        side = randbelow(2)
        return side

    def __repr__(self):
        return self.variable

face = Coin(0)

if(face.getFace() == 1):
    print("Heads")
else:
    print("Tails")
