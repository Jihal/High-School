#File I/O Test 1
#Jihal Patel
#765697
#May 25, 2018

messageFile = open('msg.txt', 'r')
messageContents = messageFile.readlines()
letters = list(messageContents)
print(messageContents, letters)
kValue = int(input())
decodedMessage = ''
for i in range(len(messageContents)):
    shiftValue = (3*(i+1))+kValue
    charValue = ord(messageContents[i])
    for k in range(shiftValue):
        charValue+=1
        if charValue > 90:
            charValue = 65
    decodedMessage+=chr(charValue)

print(decoedMessage)
