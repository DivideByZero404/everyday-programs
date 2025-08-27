#Number guessing game
import random

ran=random.randint(1,50)
while True:
    ask = input("Enter a number: ")
    if int(ask) < ran:
        print("Keep Guessing! Your answer is Lower than the actual number")
    elif int(ask) > ran:
        print("Keep Guessing! Your answer is Higher than the actual number")
    else:
      print("You got it right!!!",ran)
      break