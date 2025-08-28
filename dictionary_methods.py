#creating a dictionary and performing few methods on it: - (ordered and changeable but no duplicates allowed)
food={"Dosa":"India",
      "Burger":"America",
      "Crossiant":"Paris",
      "Hotdog":"Korea",
      "Pasta":"Italy"}

#print(food.keys())
food.update({"Mango sticky rice":"Thailand"})
print(food)


#gets the value if it is present in the dict:
if food.get("Hotdog"):
 print("yes it exists")
else:
      print("It does not exist")

#pops a specified element:
food.pop("Pasta")
print(food)

#pops the last element in the dictionary:
food.popitem()
print(food)

#to print just the key:
for key in food.keys():
      print(key, end=" ")

#to print just the value:
for value in food.values():
      print(value, end="--")

print()
#to display a 2D tuple pairs of keys and values:
for key,value in food.items():
      print(f"{key}:{value}")

#to clear a dict:
food.clear()
print(food)

