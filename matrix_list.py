import math
num = [56.79, 34.56, 12.78, 89.90, 78.43, 55.23, 12.17, 34.78, 34.56, 12.78]


print("\nOriginal list :",num)
print("\nRounding up the elements in the list : ")
for i in num:
 num_round=math.ceil(i)
 print(num_round,end="\t")

print("\nMaximum element in the list : ")
max=min=num[0]
for i in num:
    if i>max:
        max=i
print(max)

print("Minimum Element in the list : ")
for i in num:
    if i<min:
        min=i
print(min)

sum=0
print("Sum of elements :")
for i in num:
    sum=sum+int(i)
print(sum)

print("Unique numbers : ")
unique_num=[]
for i in num:
    if i not in unique_num:
         unique_num.append(i)
print(unique_num)




