#Word Count Input Output
#Jihal Patel
#765697
#May 9, 2018

import os
import re

file = open(os.path.expanduser("~/Desktop/Grade 12 Computer Science/File Reading/source.txt"))
contents = file.readlines()
wordCount = 0
wordLength = 0
for i in range(len(contents)):
    words = re.split('[^a-zA-Z]', contents[i])
    #print(words)
    for items in words:
        #print(items)
        wordLength+=len(items)
        if items.isalpha():
            wordCount+=1
#print(wordLength)
print("Total number of words:", wordCount)
print("Average word length:", wordLength/wordCount)

file.close()
