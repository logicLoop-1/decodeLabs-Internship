# Student Grade Calculator

A simple Java console application that calculates a student's total marks, average, and letter grade based on scores entered for multiple subjects.

## About

The program takes marks for one or more subjects, computes the total and average, and assigns a grade based on standard grading criteria.It demonstrates core Java fundamentals such as variables, conditional statements, loops, arrays/collections, and basic input handling.

## How it works

1. Input — The user is prompted to enter the number of subjects and the marks obtained in each one.
2. Validation — The program checks that each mark entered is within a valid range (e.g., 0–100), re-prompting if invalid input is given.
3. Calculation — The total marks are summed and the average is calculated by dividing by the number of subjects.
4. Grading — Based on the average, the program assigns a grade using a set of conditional checks against grade boundaries.
5. Output — The program displays the total, average, and final grade to the user.

## Grading Scale

| Average       | Grade |
|---------------|-------|
| 90 and above  | A+    |
| 85 – 89.99    | A     |
| 80 – 84.99    | A-    |
| 75 – 79.99    | B+    |
| 70 – 74.99    | B     |
| 66 – 69.99    | B-    |
| 63 – 65.99    | C+    |
| 60 – 62.99    | C     |
| 55 – 59.99    | C-    |
| Below 55      | F     |


## Sample Usage

```
enter student name: 
Ayesha
enter number of subjects: 
3
enter marks for subject 1 out of 100: 
88
enter marks for subject 2 out of 100: 
92
enter marks for subject 3 out of 100: 
79

----Student report----
name: Ayesha
total marks: 259
Average: 86.33333333333333
Grade: A
```