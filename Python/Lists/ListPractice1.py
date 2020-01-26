#List Practice Q1
#Jihal Patel
#765697
#ICS4U0-A
#22 Feb 2018

numFriends = int(input()) #Prompt user for number of friends
numRounds = int(input()) #Prompt user for number of removal rounds
friends = [] #Creates a list called friends

for x in range(1, numFriends+1): #Creates a for loop to add numbers to the friend list
    friends.append(x) #Adds the friends at the x number

for i in range(numRounds): #Creates a for loop for the number of removal rounds
    removalMultiple = int(input()) #Prompts user for the removal multiple
    for q in friends: #For loop that lists all the values of friends
        if q == 0: #If the value of friends is 0 at any given element
            friends.remove(0) #Removes the first occurence of 0 (Since 0 is not a friend number)
    
    for j in range(removalMultiple-1, len(friends), removalMultiple): #Creates a for loop to remove values at removal multiple 
        friends.pop(j) #Removes the value at j (every removal multiple)
        friends.insert(j, 0) #Inserts a 0 at j which is then removed so it doesn't reduce the length of the list 

for k in range(len(friends)): #Makes a for loop to print all values of friends
    if friends[k] is not 0: #If the value at k is not 0
        print(friends[k]) #Print friends value at k
    
