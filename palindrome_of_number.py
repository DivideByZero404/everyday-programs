#To check Palindrome of a number by reversing

num=int(input("Enter a number :"))
rev=0
temp=num

while temp>0:
    rem=temp%10
    rev=(rev*10)+rem
    temp=temp//10

if rev==num:
    print(f"{num} is a Palindrome Number")
else:
    print(f"{num} is not a Palindrome Number")
