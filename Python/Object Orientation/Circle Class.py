# Lesson on Object Oriented Programming
# Code for Circle Class
# ICS4U0A
# 20 Mar 2018
# Jihal Patel

from math import pi 

class Circle:

    def __init__(self,rad):
        self.radius=rad
        

    def setRadius(self, radius):
        self.radius=radius

    def getRadius(self):
        return self.radius

    def area(self):
        circleArea=pi*(self.radius**2)
        return circleArea

    def circumference(self):
        circumference=2*self.radius*pi
        return circumference

    def __repr__(self):
        return ('Radius = %.2f'%(self.radius))

spot=Circle(5)
dot=Circle(1)
print('Radius of spot is: %.2f'%(spot.getRadius()))
spot.setRadius(50)
print('New radius is: %.2f and Area of spot is %.2f'%(spot.getRadius(),spot.area()))
print('Radius of spot is: %.2f'%(spot.getRadius()))
print('Radius of dot is: %.2f'%(dot.getRadius()))
print('Circumference of spot is: %.2f'%(spot.circumference()))
print('Circumference of dot is: %.2f'%(dot.circumference()))
print(spot)
print(dot)
