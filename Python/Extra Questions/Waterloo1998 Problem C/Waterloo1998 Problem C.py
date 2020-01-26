#Waterloo 1998 Mars Rover
#Jihal Patel
#765697
#ICS4U0-A
#May 2, 2018

excursions = int(input()) #Prompts user for number of excursions
directions = [[] for i in range(excursions)] #Creates a variable to store users' directions
for i in range(excursions): #Goes through number of excursions to seperately store values
    value = None #Initializes the value variable to nothing
    while(value is not 0): #Until value is not equal to zero
        value = int(input()) #Prompt user for a direction value
        if(value == 0): #If the direction value is 0
            break #Stop the loop
        else: #If the direction value is not 0
            directions[i].append(value) #Append ith excursion directions to the ith slot in directions
            
for k in range(excursions): #Goes through all excursions again
    direction = 0 #Sets direction to 0 degrees
    x = 0 #Sets movement in x-direction 0
    y = 0 #Sets movement in y-direction 0
    for i in range(len(directions[k])): #Goes through all the directions at the kth excursion
        if directions[k][i] == 2: #If the input is 2 (Turn right)
            direction+=90 #Add 90 degrees to the current direction value
            if direction == 360: #If direction is 360 degrees
                direction = 0 #Set direction back to 0 degrees              
        if directions[k][i] == 3: #If the input is 3 (Turn left)
            direction-=90 #Subtract 90 degrees from current direction
            if direction < 0: #If the direction becomes negative
                direction = 270 #Set direction value to 270 degrees
        if directions[k][i] == 1: #If input is 1
            if directions[k][i+1] is 1: #If the next input to move forward is also 1
                if direction is 0:  #If direction is 0 degrees
                    y+=directions[k][i+1] #Add the next input value to y
                elif direction is 90: #If direction is 90 degrees
                    x+=directions[k][i+1] #Add next input value to x
                elif direction is 180: #If direction is 180 degrees
                    y-=directions[k][i+1] #Subtract next input value to y
                elif direction is 270: #If direction is 270 degrees
                    x-=directions[k][i+1] #Subtract next input value to x
                directions[k][i+1] = 0 #Set next input value to 0 so if statement doesn't run again
            else:
                if direction is 0:  #If direction is 0 degrees
                    y+=directions[k][i+1] #Add the next input value to y
                elif direction is 90: #If direction is 90 degrees
                    x+=directions[k][i+1] #Add next input value to x
                elif direction is 180: #If direction is 180 degrees
                    y-=directions[k][i+1] #Subtract next input value to y
                elif direction is 270: #If direction is 270 degrees
                    x-=directions[k][i+1] #Subtract next input value to x
    print("Distance is", abs(x)+abs(y)) #Prints the shortest distance which is the absolute value of x added to y

    #If the x coordinate value is below 0 then print the appropriate directions to get back to the starting position
    if x < 0:
        if direction is 0:
            print('2')
            direction+=90
            print('1')
            print(abs(x))
        elif direction is 90:
            print('1')
            print(abs(x))
        elif direction is 180:
            print('3')
            direction-=90
            print('1')
            print(abs(x))
        elif direction is 270:
            print('3')
            direction-=90
            print('3')
            direction-=90
            print('1')
            print(abs(x))
    #If the x coordinate value is above 0 then print the appropriate directions to get back to the starting position
    if x > 0:
        if direction is 0:
            print('3')
            direction=270
            print('1')
            print(abs(x))
        elif direction is 90:
            print('3')
            direction = 0
            print('3')
            direction = 270
            print('1')
            print(abs(x))
        elif direction is 180:
            print('2')
            direction+=90
            print('1')
            print(abs(x))
        elif direction is 270:
            print('1')
            print(abs(x))
    #If the y coordinate value is above 0 then print the appropriate directions to get back to the starting position
    if y > 0:
        if direction is 0:
            print('2')
            direction=90
            print('2')
            direction=180
            print('1')
            print(abs(y))
        elif direction is 90:
            print('2')
            direction = 180
            print('1')
            print(abs(y))
        elif direction is 180:
            print('1')
            print(abs(y))
        elif direction is 270:
            print('3')
            direction = 180
            print('1')
            print(abs(y))
    #If the y coordinate value is below 0 then print the appropriate directions to get back to the starting position
    if y < 0:
        if direction is 0:
            print('1')
            print(abs(y))
        elif direction is 90:
            print('3')
            direction = 0
            print('1')
            print(abs(y))
        elif direction is 180:
            print('2')
            direction+=90
            print('2')
            direction=0
            print('1')
            print(abs(y))
        elif direction is 270:
            print('2')
            direction = 0
            print('1')
            print(abs(y))
