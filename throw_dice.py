# to throw a random dice 

import random

#"● ┌ ─ ┐ │ └ ┘"
dice=[]
total=0
dice_art={
    1:(
"┌────────┐",
"│        │",
"│   ●    │",
"│        │",
"└────────┘"),
   2:(
"┌────────┐",
"│        │",
"│ ●  ●   │",
"│        │",
"└────────┘"),
    3:(
"┌────────┐",
"│   ●    │",
"│ ●      │",
"│   ●    │",
"└────────┘"),
     4:(
"┌────────┐",
"│ ●   ●  │",
"│        │",
"│ ●   ●  │",
"└────────┘"),
     5:(
"┌────────┐",
"│ ●   ●  │",
"│   ●    │",
"│ ●   ●  │",
"└────────┘"),
    6:(
"┌────────┐",
"│ ●   ●  │",
"│ ●   ●  │",
"│ ●   ●  │",
"└────────┘")}

user=int(input("How many dice you want to play? : "))

for die in range(user):
 dice.append(random.randint(1,6))
print(dice)

for die in range(user):
    for line in dice_art.get(dice[die]):
        print(line)


for line in range(5):
    for die in dice:
        print(dice_art.get(die)[line],end=" ")
    print()

for die in dice:
    total+=die
print(f"Total= {total}")