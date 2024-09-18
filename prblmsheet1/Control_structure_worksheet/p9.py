age=int(input("Enter your age:"))
sex=input("Enter your sex:")
days=int(input("Enter days:"))
if age >=18 and age<30:
    if sex == 'M':
        
        wage =700*days
        print(wage)
    else:
        wage = 750*days
        print(wage)
elif age>=30 and age<=40:
    if sex == 'M':
        
        wage =800*days
        print(wage)
    else:
        wage = 850*days
        print(wage)