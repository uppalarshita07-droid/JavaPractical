# Practical 07: Creating a Login Form Using Java Applet
Create a form containing fields name and password respectively, using Applet as a container.

## Technologies Used
- Java
- Java Applet
- AWT (Abstract Window Toolkit)
- HTML

## Concepts Used
- Java Applets
- Applet lifecycle method: `init()`
- AWT components: `Label`, `TextField`, and `Button`
- Layout management using `GridLayout`
- Event handling using `ActionListener`
- `ActionEvent`
- `getText()` method
- `setEchoChar()` method
- `showStatus()` method

## Files Included
- `LoginApplet.java` – Contains the Java code for the login form and event handling.
- `LoginApplet.html` – Embeds the Java Applet in an HTML page.

## Features
- Name input field.
- Password input field.
- Password masking using the `*` character.
- Submit button.
- Displays a personalised welcome message in the applet status bar.

## How the Program Works
1. The `init()` method initialises the applet and sets the layout to `GridLayout(3, 2, 10, 10)`.
2. Two labels and text fields are created for entering the name and password.
3. The `setEchoChar('*')` method masks the password characters.
4. A Submit button is created and registered with an action listener.
5. When the Submit button is clicked, the `actionPerformed()` method is called.
6. The `getText()` method retrieves the entered name.
7. The `showStatus()` method displays a welcome message containing the entered name in the applet's status bar.

## How to Run

### Option 1: Using Java 8 and Applet Viewer
**Note:** Java Applets are not supported by modern browsers and require an older compatible Java environment, such as JDK 8.

1. Save the Java program as `LoginApplet.java`.
2. Save the HTML code as `LoginApplet.html`.
3. Open Terminal or Command Prompt in the directory containing both files.
4. Compile the Java program:

   ```bash
   javac LoginApplet.java
   ```

5. Run the applet using:

   ```bash
   appletviewer LoginApplet.html
   ```

### Option 2: Using an IDE
1. Open the project in an IDE that supports Java 8.
2. Compile `LoginApplet.java`.
3. Use a compatible applet viewer to open `LoginApplet.html`.

**Note:** Most modern IDEs and browsers do not directly support Java Applets. Using the Java 8 `appletviewer` utility is recommended.

## Sample Output
<img width="796" height="486" alt="image" src="https://github.com/user-attachments/assets/41fa9e58-ca9a-493a-a77a-4aa7163e8426" />
<img width="802" height="484" alt="image" src="https://github.com/user-attachments/assets/40942c61-9304-4b49-bc84-9e10fe4e6042" />

## Result
The Java Login Applet is successfully created using AWT components and event handling to accept user input and display a welcome message.
