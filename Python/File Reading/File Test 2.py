#File I/O Test Question 2
#Jihal Patel
#765697
#ICS4U0-A
#25 May 2018

inputFile = open("input.txt", "r") #Opens input file to read
inputContents = inputFile.readlines() #Reads every line in the input file
inputFile.close() #Closes opened input file
distances = inputContents[0].split() #Splits all the distances between cities
output = [[], [], [], [], []] #Creates a 2d list to store all the distance values for the output

for i in range(len(distances)+1): #Goes through all the distances and a additional value for the 5th city
    #If i is 0 meaning the distances to calculate are from city 1 then calculate and append appropriate distances to the variable output
    if i == 0: 
        output[i].append(0)
        d1 = int(distances[i])
        output[i].append(d1)
        d2 = d1+int(distances[i+1])
        output[i].append(d2)
        d3 = d2+int(distances[i+2])
        output[i].append(d3)
        d4 = d3+int(distances[i+3])
        output[i].append(d4)
    #If i is 1 meaning the distances to calculate are from city 2 then calculate and append appropriate distances to the variable output       
    if i == 1:
        d1 = int(distances[i-1])
        output[i].append(d1)
        output[i].append(0)
        d2 = int(distances[i])
        output[i].append(d2)
        d3 = d2+int(distances[i+1])
        output[i].append(d3)
        d4 = d3+int(distances[i+2])
        output[i].append(d4)
    #If i is 2 meaning the distances to calculate are from city 3 then calculate and append appropriate distances to the variable output
    if i == 2:
        d1 = int(distances[i-1])+int(distances[i-2])
        output[i].append(d1)
        d2 = int(distances[i-1])
        output[i].append(d2)
        output[i].append(0)
        d3 = int(distances[i])
        output[i].append(d3)
        d4 = d3+int(distances[i+1])
        output[i].append(d4)
    #If i is 3 meaning the distances to calculate are from city 4 then calculate and append appropriate distances to the variable output
    if i == 3:
        d1 = int(distances[i-1])+int(distances[i-2])+int(distances[i-3])
        output[i].append(d1)
        d2 = int(distances[i-1])+int(distances[i-2])
        output[i].append(d2)
        d3 = int(distances[i-1])
        output[i].append(d3)
        output[i].append(0)
        d4 = int(distances[i])
        output[i].append(d4)
    #If i is 4 meaning the distances to calculate are from city 5 then calculate and append appropriate distances to the variable output
    if i == 4:
        d1 = int(distances[i-1])+int(distances[i-2])+int(distances[i-3])+int(distances[i-4])
        output[i].append(d1)
        d2 = int(distances[i-1])+int(distances[i-2])+int(distances[i-3])
        output[i].append(d2)
        d3 = int(distances[i-1])+int(distances[i-2])
        output[i].append(d3)
        d4 = int(distances[i-1])
        output[i].append(d4)
        output[i].append(0)
        
outputFile = open('output.txt', 'w') #Opens output file to write in 
for i in range(len(output)): #Goes through all the 5 city distances
    print(output[i][0], output[i][1], output[i][2], output[i][3], output[i][4]) #Prints output to screen as required in the question
    for j in range(len(output[i])): #Goes through all the distances at the ith city
        outputFile.write(str(output[i][j])+' ') #Writes the output to the output file
    outputFile.write('\n') #Writes a new line character to the file in order to print the next city distances on a new line
outputFile.close() #Closes output file

