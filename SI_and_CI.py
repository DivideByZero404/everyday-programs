#calculating Simple Interest and Compound Interest
p=float(input("Enter principle amount: "))
n=float(input("Enter Number of Years: "))
r=float(input("Enter Rate of Interest: "))

SI=(p*n*r)/100
A=p*((1+r/100)**n)
CI=A-p

if(p<=0 or n<=0 or r<=0):
    print("Invalid Integer, Enter a valid Integer!")
else:
    print(f"Simple Interest = {SI}")
    print(f"Compund Interest = {CI}")