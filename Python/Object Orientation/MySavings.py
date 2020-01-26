#My Savings
#Jihal Patel
#765697
#ICS4U0-A
#March 28, 2018

class MySavings:

    def __init__(self, amount, total):
        self.amount = amount
        self.total = total

    def addCoins(self):
        self.total+=amount
        
    def removeCoins(self, total):
        self.total-=amount

    def getTotal(self):
        return total
    
    def __repr__(self):
        return total
            
            

print("1. Show total in bank.")
print("2. Add a penny.")
print("3. Add a nickel.")
print("4. Add a dime.")
print("5. Add a quarter.")
print("6. Take money out of bank.")
print("Enter 0 to quit")

choice = None
total = 0
while choice is not 0:
    choice = int(input())
    if choice is 0:
        break
    elif choice is 1:
        bank = MySavings(0, total)
        total = bank.getTotal()
        print(total)
    elif choice is 2:
        bank = MySavings(1, total)
        total = bank.getTotal()
    elif choice is 3:
        bank = MySavings(5, total)
        total = bank.getTotal()
    elif choice is 4:
        bank = MySavings(10, total)
        total = bank.getTotal()
    elif choice is 5:
        bank = MySavings(25, total)
        total = bank.getTotal()
    elif choice is 6:
        withdraw = int(input("How much do you want to withdraw: "))
        bank = MySavings(withdraw, total)
        bank.removeCoins()
        total = bank.getTotal()
        
