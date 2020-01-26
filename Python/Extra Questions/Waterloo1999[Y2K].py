#Waterloo 1999 Y2K
#Jihal Patel
#765697
#ICS4U0-A
#April 24, 2018

import datetime as dt #Imports datetime 
import re #Imports regular expressions

num_of_lines = int(input()) #Prompts user for number of lines
lines = [] #Makes a variable to store lines

#Stores each line in a different list location
for i in range(num_of_lines):
    lines.append(str(input()))

#Sets formats for dates
formats_for_date= ('%B %d, %y', '%d/%m/%y', '%y.%m.%d')
#Creates variables to store values such as dates 
new_lines = [[] for i in range(len(lines))]
all_dates = [[] for i in range(len(lines))]


for line_number in range(len(lines)): #For loop goes through each line
    char = list(lines[line_number]) #Seperates each character on the line
    checkPoint = 0 #Checkpoint for going through each character
    for characters in range(len(char)): #Goes through each character

        #Checks for date with 8 characters (dd/mm/yy and yy.mm.dd formats) 
        if checkPoint+8 < len(char):
            date = None
            for i in range(checkPoint, checkPoint+8):
                if i == checkPoint:
                    date = char[i]
                else:
                    date = date+char[i]
                for frmt in formats_for_date:
                    try:
                        t = dt.datetime.strptime(date, frmt) #Checks if the 8 characters are actually a date raises valueError if date is not a date
                        if checkPoint is not 0 and checkPoint+9 <= len(char):
                            if char[checkPoint-1].isalpha():
                                notNeeded = None
                            elif char[checkPoint-1].isnumeric():
                                notNeeded = None
                            elif char[checkPoint+8].isnumeric():
                                notNeeded = None
                            elif char[checkPoint+8].isalpha():
                                notNeeded = None
                            else:
                                all_dates[line_number].append(date)
                        elif checkPoint is 0 and checkPoint+9 <= len(char):
                            if char[checkPoint+8].isnumeric():
                                notNeeded = None
                            elif char[checkPoint+8].isalpha():
                                notNeeded = None
                            else:
                                all_dates[line_number].append(date)
                    #Bypasses ValueError raised by strptime if date is not a date
                    except ValueError as err: 
                        pass
            checkPoint+=1

    checkPoint2 = 0 #New Check Point for Dates of 15 characters

    #Checks for dates with 15 characters
    for characters in range(len(char)):
        if checkPoint2+15 < len(char):
            date = None
            for i in range(checkPoint2, checkPoint2+15):
                if i == checkPoint2:
                    date = char[i]
                else:
                    date = date+char[i]
                for frmt in formats_for_date:
                    try:
                        t = dt.datetime.strptime(date, frmt)
                        if checkPoint2 is not 0 and checkPoint2+16 <= len(char):
                                if char[checkPoint2-1].isalpha():
                                    notNeeded = None
                                elif char[checkPoint2-1].isnumeric():
                                    notNeeded = None
                                elif char[checkPoint2+15].isnumeric():
                                    notNeeded = None
                                elif char[checkPoint2+15].isalpha():
                                    notNeeded = None
                                else:
                                    all_dates[line_number].append(date)
                        elif checkPoint2 is 0 and checkPoint2+16 <= len(char):
                                if char[checkPoint2+15].isnumeric():
                                    notNeeded = None
                                elif char[checkPoint2+15].isalpha():
                                    notNeeded = None
                                else:
                                    all_dates[line_number].append(date)
                    except ValueError as err:
                        pass
            checkPoint2+=1

updated_dates = [[] for i in range(len(lines))] #Creates variable to store dates with years that are updated

#Goes through each dates found in the lines: 
for line_number in range(len(all_dates)):
    for dates_on_line in range(len(all_dates[line_number])):
        #Lines below change date from 0-24 to 2000 something and 25-99 to 1900 something
        if str(all_dates[line_number][dates_on_line]).find('.') is not -1:
            split_date = all_dates[line_number][dates_on_line].split('.')
            if int(split_date[0]) <= 24:
                split_date[0] = int(split_date[0])+2000
            else:
                split_date[0] = int(split_date[0])+1900
            new_date = None
            for i in range(len(split_date)):
                if i == 0:
                    new_date = split_date[i]
                    new_date = new_date+'.'
                elif i == 2:
                    new_date = new_date+str(split_date[i])
                else:
                    new_date = new_date+str(split_date[i])
                    new_date = new_date+'.'
            updated_dates[line_number].append(new_date)
                           
        elif str(all_dates[line_number][dates_on_line]).find('/') is not -1:
            split_date = all_dates[line_number][dates_on_line].split('/')
            if int(split_date[2]) <= 24:
                split_date[2] = int(split_date[2])+2000
            else:
                split_date[2] = int(split_date[2])+1900
            new_date = None
            for i in range(len(split_date)):
                if i == 0:
                    new_date = split_date[i]
                    new_date = new_date+'/'
                elif i == 2:
                    new_date = new_date+str(split_date[i])
                else:
                    new_date = new_date+str(split_date[i])
                    new_date = new_date+'/'
            updated_dates[line_number].append(new_date)
        elif str(all_dates[line_number][dates_on_line]).find(',') is not -1:
            split_date = all_dates[line_number][dates_on_line].split(',')
            if int(split_date[1]) <= 24:
                split_date[1] = int(split_date[1])+2000
            else:
                split_date[1] = int(split_date[1])+1900
            new_date = None
            for i in range(len(split_date)):
                if i == 0:
                    new_date = split_date[i]
                    new_date = new_date+', '
                elif i == 1:
                    new_date = new_date+str(split_date[i])
            updated_dates[line_number].append(new_date)

#Goes through updated dates
for num_of_lines in range(len(lines)):
    for num_of_dates in range(len(updated_dates[num_of_lines])):
        #Replaces old dates in lines with new dates
        lines[num_of_lines] = re.sub(all_dates[num_of_lines][num_of_dates], updated_dates[num_of_lines][num_of_dates], lines[num_of_lines])
    print(lines[num_of_lines]) #Prints updated lines                           
