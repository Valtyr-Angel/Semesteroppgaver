student={
    "first_name" : "Ola" ,
    "last_name" : "Nordmann" ,
    "favourite_course" : "programmering 1"
}
print()
print(f'studentens navn er: {student["first_name"]} {student["last_name"]}')

student["favourite_course"] = "ITF10219 Programmering 1"
student["age"] = 25
print()


# https://www.altcademy.com/blog/how-to-print-a-dictionary-in-python/
for key,value in student.items():
    print(key,":",value)
    
