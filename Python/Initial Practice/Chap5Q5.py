#Chap 5, Q5
#Jihal Patel
#ICS4U0-A
#08 Feb 2018

grade = int(input('Enter the percentage: '))

if(89<grade<101):
    print('The corresponding letter grade is: '+'A')
elif(79<grade<90):
    print('The corresponding letter grade is: '+'B')
elif(69<grade<80):
    print('The corresponding letter grade is: '+'C')
elif(59<grade<70):
    print('The corresponding letter grade is: '+'D')
elif(grade<60):
    print('The corresponding letter grade is: '+'F')
