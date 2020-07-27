#Functions
#Driver function 
#In-built functions

def Marcel( age ):
    if (age > 1):
        print ("Thank You Almighty for the Grace")
    elif (age > 2):
        print("You are Great Almighty. I Thank You")

#Driver code
Marcel(int(input("Enter Age")))

#pass by reference and by value

#Pass by Reference

print("Pass By reference")

def event(x,y):
    x = {"Must wake up"}
    y = {"Must take Tea"}
    
waking = {"Wash up", "Wear attire"} 
breakfast = {"Brush teeth", "Go to school"}

event(waking, breakfast)

print(event(waking,breakfast))

#example two

def d(skeeper, little_skeeper):
    skeeper = Father;
    little_skeeper = Son;
    
    
Father = str(input("Input fathers Name "))
Son = str(input("Enter son's Name "))

d(Father, Son)

print("Son's Name is " + Son)
print("Father's Name is " + Father)
      
#Calling functions without keyword arguments

print("Calling functions without keyword arguments")


def s(firstname, lastname="Loyaltie", school="Zetech University"):
    print(firstname, lastname, "studies in", school, "School")

s("Skeeper")

s("Skeeper", "Godfrey", "Moi University")

#Calling functions with keyword arguments

print("Calling functions with keyword arguments")

s(fistname="Godfrey", school="Mombasa High")

#Keyword Arguments

print("Using Keyword arguments ")
def personal_det(lastname, firstname, age):
    print(firstname, lastname, " has an age of ", age)
    
#arguments

personal_det(firstname=str(input("Enter first name ")), lastname= str(input("Enter last name: ")), age= int(input("Enter age: ")))


#variable lengths

print("Variable length")

def f(*names):
    for name in names:
        print(name)

f("Godfrey","Gudah", "Nzingavi")

#sample 2

def d(**det):
    
    for name, age in det.items():
        age = 2020 - int(age)
        print("%s = %s" %(name, age))
            

d(name=str(input("Enter your first name only: ")), age = int(input("Enter your year of birth: ")))

#Anonymous Functions

print("Anonymous Func: ")

d = "Skeeper Loyaltie"

(lambda d: print(d))(d)

def x(n):
    return lambda s : s * n

f = x(2)

print(f)

#Codes Made by 
#Skeeper Loyaltie.
