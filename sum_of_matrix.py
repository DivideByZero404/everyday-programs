#sum of matrix
 
def summat(mat):
    sum=0
    for i in mat:
     for j in i:
        sum+=j
    return sum

mat = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print(summat(mat))