#Inheritance Test Question 1
#Jihal Patel
#765697
#ICS4U0-A
#April 23, 2018



class Document:


# constructor
# pre: none
# post: A Document object created. Words initialized to 0.

    def __init__(self, words=0):
        self.words = words


# Changes the number of document words.
# pre: none
# post: Words has been changed.
    
    def setWords(self, numWords):
        self.words = numWords



# Calculates the number of pages.
# pre: none
# post: The number of pages has been returned.


    def calculatePages(self):
        WORDS_PER_PAGE = 300
        pages = self.words / WORDS_PER_PAGE
        if (words % WORDS_PER_PAGE > 0):
            pages += 1
        return(pages)



# Returns the number of words in a document.
# pre: none
# post: The number of document words has been returned.

    def getWords(self):
        return(words)

class Essay(Document):
    def __init__(self, words):
        self.words = super().setWords(words)
        MIN_WORDS = 1500
        MAX_WORDS = 3000

    def validLength(self):
        if (self.MIN_WORDS <= self.words) and (self.MAX_WORDS > self.words):
            return True
        else:
            return False

    def getPages(self):
        return super().calculatePages()

    def getWords(self):
        return super().getWords()


EssayAssignment = Essay(1000)
print("Total pages:", EssayAssignment.getPages())
print("Total words:", EssayAssignment.getWords())
if EssayAssignment.validLength():
    print("The essay has a valid length.")
else:
    print("The essay does not have a valid length.")
