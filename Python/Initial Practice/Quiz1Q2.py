#Quiz Q2
#Jihal Patel
#765697
#ICS4U0-A
#15 Feb 2018

lowerNum=(int)(input('Enter lower limit of range: '))##Prompt user to enter lower limit number for RSA number
higherNum=(int)(input('Enter upper limit of range: '))##Prompt user to enter upper limit number for RSA numbers

count = lowerNum##Set lower limit number by user to a variable
divisor = 1##Set a variable to 1 keeping track of divisors
divCounter = 0##Checks for number of divisors between range
rsaCounter = 0##Counts number of RSA numbers in given range

while(count<=higherNum):##Loop runs all numbers in user input range
    while(divisor<=count):##Creates another loop checking if the number is divisible by divisor
        if(count%divisor==0): ##If the current number is divisble then:
            divCounter+=1 ##Increment the number of divisors by 1                                                                
        divisor+=1##Increment divisor by 1                                                                                  

    count+=1##Increase current number by 1
    divisor=1##Set divisor back to 1
    if(divCounter==4):##If there are four divisors
        rsaCounter+=1##Increment RSA numbers by 1 more
    divCounter=0##Set div counter to 0                                                                         

if(rsaCounter==1):   ##If RSA counter is 1                                                                              
    print('The number of RSA numbers between',lowerNum,'and',higherNum,'is', rsaCounter)##Print there is 1 RSA number
else: ##If RSA counter is not 1                                                                                              
    print('The number of RSA numbers between',lowerNum,'and',higherNum,'are', rsaCounter)##Print there are x number of RSA numbers
