#Assigning Partners [2014-J5]
#Jihal Patel
#765697
#ICS4U0-A
#23 Mar 2018


num = int(input()) #Prompts user for number of students in class
nameList = [[1], [2]] #Initializes nameList with 2 lists

for i in range(2): #For loop that runs twice for names to be inputted twice
    nameList[i] = [str(x) for x in input().split()] #Prompts user for names of the ith row

if (nameList[0][num-1] == nameList[1][num-1] or nameList[0][num-2] == nameList[1][num-2]): #Checks if any partner is partnered with himself or herself
    print("bad") #If above condition is met then print bad and end the program
else: #If the partners are not paired with themselves
    lastName = nameList[1].index(nameList[0][num-1]) #Initializes lastName to the position of the last name from the second row of names
    lastName2 = nameList[0].index(nameList[1][num-1]) #Initializes lastName2 to the position of the last name from the first row of names
    secondLastName = nameList[1].index(nameList[0][num-2]) #Initializes secondLastName to the position of the second last name from the second row of names
    secondLastName2 = nameList[0].index(nameList[1][num-2]) #Initializes secondLastName2 to the position of the second last name from the first row of names

    if(lastName == lastName2 and secondLastName == secondLastName2): #If the position of the last name and the second last name in both rows are the same then:
        print("good") #If above condition is met print good
    else:
        print("bad") #If above condition is not met print bad
