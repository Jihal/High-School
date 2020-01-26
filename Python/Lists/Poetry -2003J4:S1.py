#Poetry [2003-J4/S2]
#Jihal Patel
#765697
#ICS4U0-A
#20 Mar 2018

verses = int(input())
poem = []

for i in range(verses):
    for lines in range(4):
        line = [str(x) for x in input().split()]
##        for letters in line[len(line)-1]:
##            if letters = "a":
        vowelIndices = [idx for idx, ch in enumerate(line[len(line)-1]) if ch.lower() in 'aeiou']
        print(vowelIndices)



        
