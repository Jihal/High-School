#Chap 6, Q2
#Jihal Patel
#ICS4U0-A
#13 Feb 2018

numInputted = int(input("Enter a number you want prime factors of: "))                  
counter = 2

while (counter<= numInputted):
    if (numInputted%counter==0):
        print(counter)
        numInputted = numInputted/counter
    else:
        counter+=1
                  
                
                      
