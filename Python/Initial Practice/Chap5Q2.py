#Chap 5, Q2
#Jihal Patel
#ICS4U0-A
#07 Feb 2018

weight = int(input('Enter package weight in kilograms: '))
length = int(input('Enter package length in centimeters: '))
width = int(input('Enter package width in centimeters: '))
height = int(input('Enter package height in centimeters: '))

volume=length*width*height
##volumeInCubicMeters = volume/100000

if(weight>27 and volume>100000):
    print('Too heavy and too large.')
elif(volume>100000):
    print('Too large.')
elif(weight>27):
    print('Too heavy.')
