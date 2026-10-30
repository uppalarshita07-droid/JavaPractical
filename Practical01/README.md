## Practical 01: Matrix Multiplication in Java
Write a program for matrix multiplication. Use InputStreamReader and BufferedReader classes for Input/Output.

## Technologies Used
- Java
- BufferedReader
- InputStreamReader

## Concepts Used
- Two-dimensional arrays
- Nested for loops
- Conditional statements (if)
- User input using BufferedReader
- Matrix multiplication

## Condition for Matrix Multiplication
Matrix multiplication is possible only when the number of columns in the first matrix equals the number of rows in the second matrix.
If the first matrix has dimensions r1 × c1 and the second matrix has dimensions r2 × c2, then:
c1 = r2
The resulting matrix will have dimensions r1 × c2.

## How to Run (if user has IntelliJ IDEA installed)
1. Open the project in IntelliJ IDEA.
2. Open the Main.java file inside the Practical01 package.
3. Compile and run the program.
4. Enter the dimensions and elements of both matrices when prompted.

Alternatively, from the directory containing the Practical01 folder, run:
```
javac Practical01/Main.java
java Practical01.Main
```

## Expected Result
The program successfully multiplies two compatible matrices and displays their product. If the matrices are incompatible for multiplication, it displays a message indicating that multiplication is not possible.
