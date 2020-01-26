#Word Stats Input Output
#Jihal Patel
#765697
#May 9, 2018

import os
import re
from collections import Counter
file = open(os.path.expanduser("~/Desktop/Grade 12 Computer Science/File Reading/source.txt"))
contents = file.readlines()
storeWords = []
for i in range(len(contents)):
    words = re.findall(r"\w+", contents[i])
    for items in words:
        if items.isalpha():
            lowerCase = items.lower()
            storeWords.append(lowerCase)
wordOccurence = Counter(storeWords)
print("WORD" +"     OCCURENCES")
for key, value in wordOccurence.items():
    print("{}\t     {}\t".format(key, value))
file.close()
