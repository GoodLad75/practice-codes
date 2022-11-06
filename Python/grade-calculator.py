## GRADE CALCULATOR ##
## THIS PROGRAM CALCULATES YOUR AVERAGE PER SUB FOR THE WHOLE SEM ##
## AVERAGE FOR ONE SEM IS ALSO COMPUTED ##

print("\tGRADE CALCULATOR\n")

grades = []
terms = []

n = int (input("ENTER NO. OF SUBJECTS: "))

for i in range (0, n):
    print ("\nSubject")
    for j in range (3):
        term = float (input("Grade: "))
        terms.append(term)
    grade = sum(terms) / len(terms) ##avg
    grades.append(grade)
    terms.clear()

    print ("GRADE: " + "{:.2f}".format(grade))
   ## print (terms)

gen_ave = sum(grades) / len (grades)
print("\nGEN AVERAGE: " + "{:.2f}".format(gen_ave))