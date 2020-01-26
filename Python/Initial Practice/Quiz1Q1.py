#Quiz Q1
#Jihal Patel
#765697
#ICS4U0-A
#15 Feb 2018


def Translate(word): ##Creates a function called Translate with parameter word                                                                                                                             
    word = word.lower()##Makes all letters lowercase
    length = len(word)##Finds the length of the word
    if(length<4 or word.startswith('a') or word.startswith('e') or word.startswith('i') or word.startswith('o') or word.startswith('u') or word.startswith('y')): ##If the word is less than four letters or starts with a vowel
        return word##Return the same word
    elif(word.endswith('or')):##If the above condition is not met then check if the word ends with 'or'
        replaceOR = word.replace('or', 'our')##If the word ends with a 'or' then change the ending to 'our'
        return replaceOR##Return the new word with a replaced ending
    else:##If no conditions are met
        return word##Return the same word

inputtedWord = 'nil'##Creates and sets a variable called 'inputtedWord' to nil

while(inputtedWord != 'quit!'):##While the inputtedWord is not quit   
    inputtedWord = (input("Enter words to be translated: ")) ##Prompt user for a word to translate
    if (inputtedWord is 'quit!'):##If the inputtedWord is not quit
        break
    else:
        newWord = Translate(inputtedWord)##Set new word to the translated word and give the function Translate the arguement of the inputtedWord
        print(newWord)##Print the translated word
