#Time on task [2013-J4]
#Jihal Patel
#765697
#ICS4U0-A
#26 Feb 2018

time = int(input())
chores = int(input())
timeChore=[]
choresDone = 0
timeLeft = 0

for i in range(chores):
    timeChore.append(int(input()))

timeChore.sort()

for i in timeChore:
    if timeLeft < time:
        timeLeft+=i
        if timeLeft <= time:
            choresDone+=1

print(choresDone)
    
