#Chapter 4, Q5
#Jihal Patel
#ICS4U0-A
#07 Feb 2018

mass = float(input('Enter the mass in kilograms: '))
energy = mass*((3*10**8)**2)
lightBulbs = energy/360000
print('The energy produced in Joules is = %0.1E' %(energy))
print('The number of 100-watt light bulbs powered = %0.1E' %(lightBulbs))
