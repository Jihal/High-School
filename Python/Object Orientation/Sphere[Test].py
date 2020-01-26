#Shpere Question [Test 1] 
#Jihal Patel
#765697
#ICS4U0-A
#March 28, 2018

from math import pi #Imports pi from math library

class Sphere: #Creates Sphere class

    def __init__(self, radius):#Creates constructor with radius
        self.radius = radius #Creates new object for radius

    def getVolume(self):#Creates function for getting volume
        volume = 4*pi*(self.radius**3)/3 #Using volume formula for getting volume
        return volume #Returns volume

    def getSurfaceArea(self): #Creates function for getting surface area
        surfaceArea = 4*pi*(self.radius**2)#Using surface area formula to get surface area
        return surfaceArea#Returns surface area
    
radius = int(input("Enter the radius of the sphere: ")) #Prompts user for radius
sphere = Sphere(radius)#sets sphere to the class sphere with a radius parameter

print("The volume of the sphere is:", sphere.getVolume()) #Prints volume of sphere
print("The surface area of the sphere is:", sphere.getSurfaceArea()) #Prints surface area of sphere
