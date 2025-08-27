#password checker

import string

def password(var):
    if len(var) < 8:
        print("Password must contain atleast 8 characters")
        return
    if not any(c.isupper() for c in var):
        print("Needs atleast 1 Uppercase")
        return
    if not any(c.isdigit() for c in var):
        print("Needs atleast 1 digit")
        return
    if not any(c in string.punctuation for c in var):
        print("Needs atleast one special symbol")
        return
    if " " in var:
        print("No white spaces allowed in passwords")
        return

    print(" Your password is strong!")

user=input("Enter your password: ")
password(user)