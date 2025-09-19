# 5. Tuples:
# a.	Tuple1: Given a list of tuples, [(6, 24, 12), (60, 12, 6, -300), (12, -18, 21)] .
# i.	extract all tuples which have all elements divisible by K=6.
# ii.	get all the tuples that have all positive elements
# iii.	sort a list of tuples in increasing order by the last element in each tuple.
# iv.	Sort the tuples on basis of total digits in tuple.

tup=[(6, 24, 12), (60, 12, 6, -300), (12, -18, 21)]
print("List of Tuples : ",tup)
print()

#1 extract all tuples which have all elements divisible by K=6
k=6

res=[i for i in tup if all(j % k==0 for j in i)]
print("i. All tuples which have all elements divisible by 6 : ",res)

#2 get all the tuples that have all positive elements
res=[i for i in tup if all(j > 0 for j in i)]
print("ii. All the tuples with positive elements : ",res)

#3 sort a list of tuples in increasing order by the last element in each tuple
sorted_element=sorted(tup,key=lambda i:i[-1])
print("iii. Decreasing order by the last element in each tuple : ", sorted_element)

#4 Sort the tuples on basis of total digits in tuple
total_digits=sorted(tup,key=lambda i : sum(len(str(abs(j))) for j in i))
print("iv. Sorted tuples based on total digits in tuple : ",total_digits)






