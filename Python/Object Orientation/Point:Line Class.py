#Point and Line Class
#Jihal Patel
#765697
#ICS4U0-A
#March 28, 2018

from math import sqrt #Imports sqaure root function from math library

class Point: #Creates a point class

    def __init__(self, x_coordinate, y_coordinate): #Creates constructor with x and y coordinate
        self.x_coordinate = x_coordinate #Creates a new object for x coordinate
        self.y_coordinate = y_coordinate #Creates a new object for y coordinate

    def get_xCoor(self): #Creates a function for getting the x coordinate
        return self.x_coordinate #Returns x coordinate

    def get_yCoor(self): #Creates a function for getting the y-coordinate
        return self.y_coordinate #Returns y coordinate 

    def distanceFromOrigin(self): #Creates a function for getting the distance from origin for the point
        distance = sqrt((self.x_coordinate**2)+(self.y_coordinate**2)) #Calculates the distance using pythagoream theorem
        return distance #Returns distance


class Line: #Creates a line class

    def __init__(self, pointA, pointB): #Creates a constructor with both points 
        self.pointA = pointA #Creates a new object for point a
        self.pointB = pointB #Creates a new object for point b

    def getLength(self): #Creates a function to get length for point A to B
        length = sqrt((pointA.get_xCoor()-pointB.get_xCoor())**2+(pointA.get_yCoor()-pointB.get_yCoor())**2) #Calculates length of line
        return length #Returns length of line
        
pointA_x = int(input('Enter point A x-coordinate: ')) #Prompts user for point A x-coordinate
pointA_y = int(input('Enter point A y-coordinate: ')) #Prompts user for point A y-coordinate
pointB_x = int(input('Enter point B x-coordinate: ')) #Prompts user for point B x-coordinate
pointB_y = int(input('Enter point B y-coordinate: ')) #Prompts user for point B y-coordinate

pointA = Point(pointA_x, pointA_y) #Sets pointA to the x and y coordinates of the point
pointB = Point(pointB_x, pointB_y) #Sets pointB to the x and y coordintes of the point
lengthOfLine = Line(pointA, pointB) #Sets length of line to the line class with both points

print('The distance from the origin for point A is: ', pointA.distanceFromOrigin()) #Prints pointA's distance from the origin
print('The length of the line from point A to B is: ', lengthOfLine.getLength()) #Prints length of line
