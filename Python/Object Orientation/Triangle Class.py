#Triangle Class
#Jihal Patel
#765697
#ICS4U0-A
#March 27, 2018

from math import sqrt

class Triangle:

    def __init__(self, side=[], angle=[]):
          self.side = side
          self.angle = angle
          
    def setSides(self, s1, s2, s3):
        self.side[0] = s1
        self.side[1] = s2
        self.side[2] = s3

    def getSides(self):
        return self.side

    def setAngles(self, a1, a2, a3):
        self.angle[0] = a1
        self.angle[1] = a2
        self.angle[2] = a3

    def getAngles(self):
        return self.angle

    def Perimeter(self):
        perimeter = 0
        for i in range(len(self.side)):
            perimeter+=self.side[i]
        return perimeter

    def Area(self):
        p = 0
        for i in range(len(self.side)):
            p+=self.side[i]
        p = p/2
        area = sqrt(p*(p-self.side[0])*(p-self.side[1])*(p-self.side[2]))
        return area
        
triangle = Triangle([3, 4, 5], [90, 45, 45])
triangle.setSides(3, 4, 5)
triangle.setAngles(90, 45, 45)

print("The sides are: ", triangle.getSides())
print("The angles are: ", triangle.getAngles())
print("The perimeter is: ", triangle.Perimeter())
print("The area is: ", triangle.Area())


    
