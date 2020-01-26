#List Practice Q2
#Jihal Patel
#765697
#ICS4U0-A
#22 Feb 2018

count = int(input("What is the count: ")) #Prompts user for number of count
numStorage = [] #Creates a list call numStorage 
finalAmount = 0 #Initializes finalAmount to 0

for i in range(count): #Until count i does not reach count: 
    numInput = int(input("What does the boss say: ")) #Prompt user for boss's number
    numStorage.append(numInput) #Add that boss's number to numStorage

    if numInput is 0: #If the number that the boss is inputteed is 0
        j=i-1 #Make j equal to the position of the previous number inputted in the list
        while(numStorage[j] is 0): #If the number before is 0 then until the number at j is not 0
            j-=1 #Decrease j by 1
        numStorage.pop(j) #Remove item at j
        numStorage.insert(j, 0) #Insert a 0 at j 

for itemsIn_numStorage in range(len(numStorage)): #For loop that goes through all items in list
    finalAmount = finalAmount + numStorage[itemsIn_numStorage] #Adds all items in list

print("The total is:", finalAmount) #Print final Amount
