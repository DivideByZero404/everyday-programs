#swapping list elements

def listswap(f):
    if len(f) >=2:
      f[0],f[-1]= f[-1],f[0]
    return f

print(listswap([1,3,4]))