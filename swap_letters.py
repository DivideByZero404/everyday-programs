#swapping the letters in a word

def swapp(s):
    if len(s) <=1:
        return s
    return s[0] + s[-2] +s[2:-2]+s[1] +s[-1]

print(swapp("python"))
# python -pothyn

