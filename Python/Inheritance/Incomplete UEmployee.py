#UEmployee, Faculty, Staff

class UEmployee:
    def __init__(self, employeeName, salary):
        self.employeeName = employeeName
        self.salary = salary

    def returnSalary(self):
        return self.salary

    def returnName(self):
        return self.employeeName

class Faculty(UEmployee):
    def __init__(self, employeeName, salary, departName):
        self.departName = departName
        super().__init__(employeeName, salary)

    def getDepart(self):
        return self.departName

class Staff(Faculty):
    def __init__(self, employeeName, salary, departName, jobTitle):
        self.jobTitle = jobTitle
        super().__init__(employeeName, salary, departName)

    def getTitle(self):
        return self.jobTitle

    def __repr__(self):
        return
