#Anagram Exam Q2
#Jihal Patel
#765697
#ICS4U0-A
#14 June 2018

inputFile = open('in.txt', 'r')                         #Opens input file
inputContents = inputFile.readlines()                   #Reads contnets of input file
inputFile.close()                                       #Closes input file

pharses=[[],[]]                                         #Creates a 2D list called pharses to store different pharses

for i in range(len(inputContents)):                     #Goes through input contents
    inputContents[i] = inputContents[i].strip("\n")     #Removes new line character from input contents
    pharse = inputContents[i]                           #Stores ith pharse in input contents to the variable pharse  
    pharse = pharse.replace(" ", "")                    #Removes spaces from the phrase
    for j in range(len(pharse)):                        #Goes through each letter in the phrase
        pharses[i].append(pharse[j])                    #Stores the different letters of the ith phrase in the ith list in phrases created above

pharses[0].sort()                                       #Sorts phrase 1 letters in alphabetical order in order to compare
pharses[1].sort()                                       #Sorts pharse 2 letters in alphabetical order in order to compare
        
if pharses[0] == pharses[1]:                            #Checks if sorted pharses are equal
    print("Is an anagram.")                             #If above condition is met, print that the phrases is an anagram
else:                                                   #If above condition is not met
    print("Is not an anagram.")                         #Print that the phrases are not an anagram
