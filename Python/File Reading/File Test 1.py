#File I/O Test Question 1
#Jihal Patel
#765697
#ICS4U0-A
#25 May 2018

file = open('sX.txt', 'r') #Opens the file containing the input
fileContents = file.readlines() #Reads each line in the file if there is more than 1
file.close() #Closes opened file 
letters = [] #Creates a list to store each letter in the text seperately
tCount = 0 #Creates a variable to count the "t"s and "T"s
sCount = 0 #Creates a variable to count the "s"s and "S"s
for i in range(len(fileContents)): #Goes through each line in the file
    letters.append(list(fileContents[i])) #Seperates every single letter in the file
for j in range(len(letters)): #Goes through each line in the file
    for k in range(len(letters[j])): #Goes through each letter in the jth line
        if letters[j][k] == "t" or letters[j][k] == "T": #Checks if letter is 't' or 'T'
            tCount+=1 #If the letter is 't' or 'T' then add one to tCount
        elif letters[j][k] == "s" or letters[j][k] == "S": #Checks if letter is 's' or 'S' 
            sCount+=1 #If the letter is 's' or 'S' then add one to sCount
if tCount > sCount: #If there are more 't's or 'T's in the input
    print("English") #Print English if above condition is met
elif sCount > tCount: #If there are more 's's or 'S's in the input
    print("French") #Print French if above condition is met
else: #If both 's's or 'S's and 't's or 'T's are equal
    print("French") #Print French if above condition is met
