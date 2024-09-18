num1=int(input("Enter any  numbers:"))
num2=int(input("Enter any  numbers:"))
choice=int(input("Enter your choice:"))

if choice==1:
   sum=num1+num2
   print(sum)
elif choice == 2:
    sub=num1-num2
    print(sub)
elif choice==3: 
    mul=num1*num2
    print(mul)
else:
    div=num1%num2
    print(div)
    
   