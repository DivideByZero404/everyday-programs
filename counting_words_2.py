#counting the words

var=input("Enter your text: ")
count=1
for i in var:
  if i == " ":
    count+=1
print(count)