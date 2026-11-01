# Practical 03: Calculator Using Java AWT
Write a program to design a calculator using the AWT controls provided in Java.

## Technologies Used
- Java
- AWT (Abstract Window Toolkit)

## Concepts Used
- AWT components: `Frame`, `Label`, `TextField`, and `Button`
- Layout management using `FlowLayout`
- Event handling using `ActionListener`
- `ActionEvent` and `WindowAdapter`
- Exception handling using `try-catch`
- Conditional statements (`if-else`)
- Arithmetic operations
- Creating and displaying a GUI window

## Files Included
- `Main.java` – Contains the Java code for the calculator.

## Features
- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`)
- Clear button to reset all fields
- Validation of numeric input
- Division-by-zero handling
- Non-editable result field
- Window closing support

## How to Run

### Using an IDE
1. Open the project in a Java IDE, such as IntelliJ IDEA, Eclipse, or NetBeans.
2. Open `Main.java`.
3. Run the program.

### Using Terminal or Command Prompt
1. Ensure that the Java Development Kit (JDK) is installed on your system.
2. Save the program as `Main.java`.
3. Open Terminal (macOS/Linux) or Command Prompt (Windows).
4. Navigate to the directory containing `Main.java`.
5. Compile the program:

   ```bash
   javac Main.java
   ```

6. Run the program:

   ```bash
   java Main
   ```

## Expected Output
A calculator window titled **Calculator** appears with two input fields, buttons for arithmetic operations, a Clear button, and a result field.

For example, if the first number is `20` and the second number is `5`:

| Operation | Result |
|---|---:|
| Addition (+) | 25.0 |
| Subtraction (-) | 15.0 |
| Multiplication (*) | 100.0 |
| Division (/) | 4.0 |

If the user enters invalid numbers, the program displays `Enter valid numbers`. If the user attempts to divide by zero, it displays `Cannot divide by zero`.

## Sample Output
<img width="924" height="1236" alt="image" src="https://github.com/user-attachments/assets/65befab2-3f79-420f-87ed-2e4c82f9a1c8" />
