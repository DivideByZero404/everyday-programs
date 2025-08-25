#guess the answers - quiz

questions= (("what color is the sky? "),
       ("What color is the milk? "),
       ("how many planets are there in solar system? "),
       ("How many days are there in a leap year? "),
       ("What is the symbol of water?" ))
options=(("A. pink","B. yellow","C. blue","D. pink"),
     ("A. brown","B. white","C. orange","D. red"),
     ("A. 5","B. 6","C. 7","D. 8"),
     ("A. 364","B. 365","C. 366","D. 363"),
     ("A. H2o","B. F2o","C. W2o","D. H3o"))
answers=(("C","B","D","C","A"))
guess=[]
score=0
question_number=0

print("---- WELCOME TO QUIZ ----")
print(len(questions))
for ques in questions:
  print(ques)
  for option in options[question_number]:
    print(option)

  guesses=input("Enter your guess( A, B, C ,D ) :").upper()
  guess.append(guesses)
  if guesses == answers[question_number]:
     score+=1
     print("HURRAY! CORRECT ANSWER!")
  else:
     print("OOPS!, INCORRECT ANSWER!")

  question_number+=1

print()
print("----RESULTS----\n")
print("Correct Answers : ",end=" ")

for ans in answers:
     print(ans,end=" ")
print()

print("Your Guesses   :   ",end=" ")
for gues in guess:
         print(gues,end=" ")
print()
score += int(score/len(questions)) -1
print(f"Your Score is   : {score} / 5")