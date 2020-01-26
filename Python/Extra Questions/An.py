
file=open('Blah.txt','r')                 #Reading the input from a file
contents=list(file)
print(contents)#Converitng the input into a list
file.close()                            #Closing the file

phrase1=[]                              #Creating a list which will store each alphabet of first phrase
phrase2=[]                              #Creating a list which will store each alphabet of second phrase
for i in range(0,len(contents)):        #Loop iterates to each phrase
    each=contents[i]                    #Setting each phrase into a string variable
    each=each.upper()                   #Making sure it is all uppercase letters
    each=each.replace('\n','')          #Replacing newline character from string
    each=each.replace(' ','')
    #replacing all spaces of string
    print(each)
    for j in range(0,len(each)):        #loop iterates through each letter of each phrase
        if(i==0):                       
            phrase1.append(each[j])     #Appending to phrase 1 if phrase is in first line of input
        else:                           
            phrase2.append(each[j])     #Appending to phrase 2 if phrase is in second line of input

phrase1.sort()
phrase2.sort()
if(phrase1==phrase2): print('Is an anagram')
else: print('Is not an anagram')
    
