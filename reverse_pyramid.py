n=int(input("Enter no.of rows :"))
# for i in range(1,n+1):
#     for j in range(1,i+1):
#        print(" "*j,"*",end="")
#     print("\n")

for i in range(n+1,-1,-1):
    for j in range(i-1-1,-1,-1):
        print(" "*j,"*",end="")
    print("\n")

    j

