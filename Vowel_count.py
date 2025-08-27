#counting the number of vowels in a string

def vowels(string):
    count=0
    for i in string.lower():
        if i in 'aeiou':
            count+=1
    return count

print("Number of vowels in the word are: ")
print(vowels("Helloo"))