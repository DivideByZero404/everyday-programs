#duplicate 

def dup(s):
    result=""
    for i in str(s):
        if i not in result:
            result+=i
    return result

print(dup("malayalam"))