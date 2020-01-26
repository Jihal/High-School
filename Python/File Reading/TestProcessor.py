#MadLib
#Jihal Patel
#765697
#May 16, 2018

from random import randint

storyFile = open('story.txt', 'r')
storyContents = storyFile.readlines()
verbsFile = open('verbs.txt', 'r')
verbsContents = verbsFile.readlines()
nounsFile = open('nouns.txt', 'r')
nounsContents = nounsFile.readlines()
newStory = open('new story.txt', 'w')
for i in range(len(verbsContents)):
    verbsContents[i]=verbsContents[i].strip("\n")
    
for i in range(len(nounsContents)):
    nounsContents[i]=nounsContents[i].strip("\n")
    
for i in range(len(storyContents)):
    storyContents[i]=storyContents[i].strip("\n")
    countHashtags = storyContents[i].count("#")
    countPercent = storyContents[i].count("%")
    for percent in range(countPercent):
        storyContents[i]=storyContents[i].replace("%", verbsContents[randint(0, 2)], 1)
    for hashtag in range(countHashtags):
        storyContents[i]=storyContents[i].replace("#", nounsContents[randint(0, 2)], 1)
    newStory.write(storyContents[i]+'\n')

storyFile.close()
verbsFile.close()
newStory.close()
nounsFile.close()
            



