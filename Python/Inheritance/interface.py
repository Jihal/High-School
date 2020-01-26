# Lesson on Abstract Class
#ICS4U0
#Mr Veera
#20 Nov 2017

from math import pi 

# Code for Class Shape

# Constructor
#pre: none
#post: No objects can be instantiated. Class only can be inherited.
    
class Shape:
    def __init__(self):
        pass

#Abtract function
#pre: none
#post: has to be definded in the inherited class
    def area():
        return NotImplemented

    def __repr__(self):
        return NotImplemented

    
# Code for inherted classes
class Rectangle(Shape):
# Constructor
#pre: none
#post: A Rectangle object has been created with length - length, and width - width
    def __init__(self, length, width):
        super().__init__()
        self.length=length
        self.width=width

#Calculates the area of the rectangle.
#pre: none
#post: The area of the rectangle has been returned.
    def area(self):
        return (self.length*self.width)

# Returns a String that represents the Rectangle object
# pre: none
# post: A string representing the Rectangle object has been returned.
    def __repr__(self):
        return ('Length = %.2f %s Width = %.2f'%(self.length,'\n',self.width))



class Triangle(Shape):
# Constructor
#pre: none
#post: A Triangle object has been created with height - height, and base - base
    def __init__(self, height, base):
        super().__init__()
        self.height=height
        self.base=base

#Calculates the area of the triangle.
#pre: none
#post: The area of the triangle has been returned.
    def area(self):
        return (0.5*self.base*self.height)

# Returns a String that represents the Triangle object
# pre: none
# post: A string representing the Triangle object has been returned.
    def __repr__(self):
        return ('Height = %.2f %s Base = %.2f'%(self.height,'\n',self.base))

#client code
nathan_philip=Rectangle(200,50)
shape1=Shape(nathan_philip)
lourve = Triangle(20, 100)
shape2=Shape(lourve)
print('Area of shape1 is: '+shape1.area())
print('Area of shape2 is: '+shape2.area())
print(nathan_philip)

print('Area of nathan_philip square is: %.2f'%(nathan_philip.area()))
print('Area of lourve pyramid is: %.2f'%(lourve.area()))

    




        
