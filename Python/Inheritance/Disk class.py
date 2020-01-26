# Lesson on Inheritance
#ICS4U0
#Mr Veera
#14 Nov 2017

from math import pi 

# Code for Class Circle
class Circle:

# Constructor
#pre: none
#post: A Circle object has been created with radius - radius
    def __init__(self,radius):
        self.radius=radius

# Changes the radius of the circle.
#pre: none
#post: The radius has been changed
    def setRadius(self, radius):
        self.radius=radius

# Returns the radius of the circle.
#pre: none
#post: The radius has been return.
    def getRadius(self):
        return self.radius

# Calculates the area of the circle.
#pre: none
#post: The area of the circle has been return.
    def area(self):
        circleArea=pi*(self.radius**2)
        return circleArea

# Returns a String that represents the Circle object
# pre: none
# post: A string representing the Circle object has been returned.
    def __repr__(self):
        return ('Radius = %.2f'%(self.radius))

# Determines if the object is equal to another Circle object.
# pre: Circle is a Circle object.
# post: true has been returned if objects have the same radii.
#       False has been returned otherwise.
    def __eq__(self,Circle):
        if (self.radius==Circle.radius):
            return True
        else:
            return False
        
# Disk Class
class Disk(Circle):

# Constructor
#pre: none
#post: A Disk object has been created with radius - radius and thickness - thickness
    def __init__(self,radius, thickness):
        self.thickness=thickness
        super().__init__(radius)

# Changes the thickness of the disk.
#pre: none
#post: The thickness has been changed
    def setThickness(self,thickness):
        self.thickness=thickness

# Returns the thickness of the circle.
#pre: none
#post: The thickness has been return.
    def getThickness(self):
        return self.thickness

# Calculates the volume of the disk.
#pre: none
#post: The volume of the disk has been return.
    def volume(self):
        cylinder_volume=super().area()*self.thickness
        return cylinder_volume

# Determines if the object is equal to another Disk object.
# pre: Disk is a Disk object.
# post: true has been returned if objects have the same radii and thickness.
#       False has been returned otherwise.
    def __eq__(self,Disk):
        if (self.thickness==Disk.thickness and super().__eq__(Disk)):
            return True
        else:
            return False

# Returns a String that represents the Circle object
# pre: none
# post: A string representing the Disk object has been returned.
    def __repr__(self):
            return( super().__repr__()+ ', Thickness = %.2f'%(self.thickness))


# client code below
saucer=Disk(10,0.2) # instantiates a Disk object called saucer
print(saucer)       # prints the details of the Disk object created in the line above

plate1=Disk(12,0.07) # instantiates a Disk object called plate1
plate2=Disk(12,0.07) # instantiates a Disk object called plate2

# compares Disk objects plate 1 with plate 2
if(plate1==plate2):
    print('Objects are equal')
else:
    print('Objects are not equal')

print(plate1) # prints the details of the Disk object plate1
print(plate2) # prints the details of the Disk object plate2

circle1=Circle(0.5)
circle2=Circle(0.5)
if(circle1==circle2):
    print('Circles are equal')
else:
    print('Circles are not equal')
