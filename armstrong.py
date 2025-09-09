print("Armstrong numbers between 100 and 400 :")
for i in range(100,400+1):
    digit=len(str(i))
    temp=i
    sum=0
    while(temp>0):
        rem=temp%10
        sum+=rem**digit
        temp=temp//10

    if sum==i:
      print(i,end="\t")
