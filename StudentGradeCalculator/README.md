# Student Grade Calculator

A simple Java console application that calculates a student's total marks, average, and letter grade based on scores entered for multiple subjects.

## Features

- Accepts a student's name and marks for any number of subjects
- Calculates:
  - **Total marks**
  - **Average marks**
  - **Letter grade** (based on average)
- Displays a clean summary report

## Project Structure

```
StudentGradeCalculator/
├── Main.java      # Entry point; handles user input and prints the report
└── Student.java   # Student class; stores data and computes total/average/grade
```

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

## Requirements

- Java Development Kit (JDK) 8 or higher

## How to Compile and Run

1. Clone or download this repository.
2. Open a terminal in the project folder.
3. Compile the source files:

   ```bash
   javac -d out StudentGradeCalculator/Main.java StudentGradeCalculator/Student.java
   ```

   (Adjust paths as needed based on how your files are organized locally.)

4. Run the program:

   ```bash
   java -cp out StudentGradeCalculator.Main
   ```

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

## Notes / Possible Improvements

- Input validation could be added (e.g., rejecting marks outside 0–100 or non-numeric input).
- The average could be formatted to a fixed number of decimal places for cleaner output.
- Subject names could be tracked alongside marks for a more detailed report.

## License

This project is free to use and modify for learning purposes.
