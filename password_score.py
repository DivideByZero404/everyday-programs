import string

def passw(strin):
    score=0
    if len(strin) > 8:
        score+=1
    if any(c.isupper() for c in strin):
        score+=1
    if any(c.isdigit() for c in strin):
        score+=1
    if any(c in string.punctuation for c in strin):
        score+=1
    if " " not in strin:
        score+=1

    print(f"Password score = {score}/5")

    if score <=2:
        print("Your password is WEAK.")
    elif score <=4:
        print("Your password is MEDIUM.")
    else:
        print("Your password is STRONG!")

user = input("Enter password: ")
passw(user)