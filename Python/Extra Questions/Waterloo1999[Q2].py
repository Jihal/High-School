#Waterloo-1999-Day1Q2
#Jihal Patel
#765697
#ICS4U0-A
#April 24, 2018

from collections import Counter

dataSets = int(input())

for i in range(dataSets):
    mAndk = [int(x) for x in input().split()]
    words = []

    for m in range(mAndk[0]):
        words.append(str(input()))

    frequency = Counter(words).most_common(mAndk[1])

    print(str

    

        
