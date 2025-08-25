#number guessing game
import random

low_num=1
high_num=50
guess=0
still_running=True

your_guess = random.randint(low_num,high_num)
print(" ---- WELCOME TO NUMBER GUESS ---- ")
while still_running:
    ans=input(f"Guess a number between {low_num} and {high_num}:")
    if ans.isdigit():
        ans=int(ans)
        guess+=1

        if ans < your_guess:
             print("Your guess is too low!")
        elif ans > your_guess:
            print("Your guess is too high!")
        else:
            print(f"Huraay! You guessed the number right - {your_guess}")
            print(f"Total guess moves = {guess}")
            still_running=False

    else:
        print(f"Inavlid Input, please enter a number between {low_num} and {high_num}: ")