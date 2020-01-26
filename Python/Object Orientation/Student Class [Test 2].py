#Student Class [Test Q2]
#Jihal Patel
#765697
#ICS4U0-A
#April 9, 2018

from random import randint

class Student:

    def __init__(self, students=[], studentBirthdays=[]):
        self.students=students
        self.studentBirthdays=studentBirthdays
        
    def getName(self, student):
        return self.students[student]

    def getAge(self, student):
        date = self.studentBirthdays[student].split()
        cYear = 2018
        cMonth = 4
        cDay = 9
        if cMonth < int(date[1]):
            return cYear-int(date[0])-1
        elif cMonth > int(date[1]):
            return cYear - int(date[0])
        else:
            if cDay > int(date[0]) or cDay == int(date[0]):
                return cYear - int(date[0])
            else:
                return cYear-int(date[0])-1

class Courses:
    def __init__(self, courses=[], studentEn=[]):
        self.courses = courses
        self.studentEn = studentEn

    def getCourses(self, student):
        studentCourses = self.studentEn[student].split()
        stuCour = []
        for i in range(3):
            stuCour.append(self.courses[int(studentCourses[i])])
        return stuCour

studentNames = ["Jack Peterson", "Kally Ryer", "Johnson Bud", "Fredrick Taylor", "Fortune Cookie"]
studentBirthdays = ["2000 4 30", "1993 8 2", "1999 6 22", "2003 3 19", "2002 9 25"]
courses = ["Math", "Science", "Computer Science", "English"]
studentEnrollment = ["1 2 3", "2 1 0", "1 2 3", "3 2 0", "0 1 2"]

student = Student(studentNames, studentBirthdays)
courses = Courses(courses, studentEnrollment)

for i in range(len(studentNames)):
    print("Student number", i+1, "is:", studentNames[i]+".", "Age:", str(student.getAge(i))+".", "Courses enrolled in:", courses.getCourses(i))


