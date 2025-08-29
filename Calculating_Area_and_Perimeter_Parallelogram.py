#Calculating Area and Perimeter of a Parallelogram
base=int(input("Enter base: "))
height=int(input("Enter height: "))
side=int(input("Enter side:"))

 
if(base<=0 or height <=0 or side<=0):
    print("Enter Valid Integer!")
else:
 perimeter = 2 * (base + side)
 area = base * height
 print(f"Area of the Parallelogram = {area}")
 print(f"Perimeter of the Parallelogram = {perimeter} ")



