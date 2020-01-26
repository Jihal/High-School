print('*'+'Hello')
num1 = 3
num2 = 5
print(num1,'+',num2)
##If you want to print on the same line then add (,end='') 

##Scientific notation
big_num = 4050000000
small_num = 0.00037
print(big_num, small_num)
print('Big and small numbers in scientific notation: %0.2E %0.3E' %(big_num, small_num))

##Functions

def FunctionName(parameter): ##Parameter is not mandatory
    ##Here goes whatever you want the function to do
    return value ##This returns a value

takingFunctionValue = FunctionName(argument) ##Arguement is the value you want the parameter to take and this variable will story the value returned by the function 

##Lists/Arrays

marks = [95, 98, 97, 90, 85]
print (marks[2]) 

mark.pop[i] ##Removes element at i

##List Functions:
##mark.pop[i] Removes element at i
##mark.reverse() Reverses all elements (DOES NOT WORK FOR STRINGS)
##mark.remove(i) Removes first occurence of mark i
##mark.append(value) Adds a value to the end of marks
##mark.insert(i, x) Inserts mark i and position x

#2D Lists
values = [] #Creates list called values
values.append([1, 2, 3, 4]) #Creates a list inside a list storing 1234
values.append([5, 6, 7, 8]) #Creates another list inside the orignal list storing 5678
print(values) #This would be print [[1, 2, 3, 4], [5, 6, 7, 8]

#How to get multiple inputs in the same line:
intNames = [int(x) for x in input().split()]; #Takes integer inputs seperated by a space denoted in split()
stringNames = [str(x) for x in input().split(",")]; #Takes string inputs seperated by a comma denoted in split()

#Object Orientation
#Declaring your own data type is a class for instance student, fruit, vehicle, etc.
#Variables of the class are  called objects
#Object is an instant of a class
#Class -> Variables[Characteristics] -> Functions[Behaviour of a Class]

#Example of Object Orientation
class Circle
#The circle class can have characteristics such as radius, filled, colour, etc.
#Behaviours of the class would include set radius, set colour, set filled, set area, etc.

#Inheritance
#Vehicale > Car > Toyota > Miral > My Miral
#Vehicale is a super class which is more general
#Everything else is a subclass and My Miral is an object
class Circle
class Disk(Circle): #Creates class disk with a super class called circle
    def __init__(self, radius, thickness):
        self.thickness = thickness
        super().__init__(radius) #This gets the radius from the super class circle
