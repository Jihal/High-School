#Big Bang Secrets
#Jihal Patel
#765697
#ICS4U0-A
#20 Feb 2018

kValue = int(input())
string = str(input())
string = string.upper()
letters = []

for allLetters in string:
    letters.append(allLetters)

for i in range(len(letters)):
    position = i + 1
    shift = (3*position) + kValue
    unicodeValue = ord(letters[i])
    unicodeValue = unicodeValue - shift
    if unicodeValue < 65:
        difference = 65-unicodeValue
        unicodeValue = 91-difference
    newLetter = chr(unicodeValue)
    letters.pop(i)
    letters.insert(i, newLetter)

for elements in letters:
    print(elements, end='')
    
