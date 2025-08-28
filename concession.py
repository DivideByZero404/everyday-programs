#consession stand program using dictionary

food={"popcorn":100,
      "nachos":90,
      "soda":110,
      "donut":120,
      "fries":115}

total=0
cart=[]

print("------ MENU ------")
for key,value in food.items():
    print(f"{key:8} - Rs.{value}")

print("------ ---- ------")

while True:
 stuff= input("Enter your food to your cart (press q to quit): ").lower()

 if stuff == "q":
     break
 elif food.get(stuff) is not None:
     cart.append(stuff)

print()
print("--- YOUR ORDER ---")
for stuff in cart:
  total += food.get(stuff)
  print(stuff,end=" ")

print()
print(f"Your Total is - Rs. {total}")