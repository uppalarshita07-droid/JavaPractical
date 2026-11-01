# Practical 05: Creating a Notepad Application Using Java Swing
Write a program to create some of the features of Notepad. Use Swings for designing the application.

## Technologies Used
- Java
- Java Swing
- Java AWT
- Java I/O

## Concepts Used
- GUI development using Java Swing
- Inheritance using `JFrame`
- Event handling using `ActionListener`
- `JTextArea` for text editing
- `JMenuBar`, `JMenu`, and `JMenuItem`
- `JFileChooser` for file selection
- File handling using `FileReader` and `FileWriter`
- Buffered I/O using `BufferedReader` and `BufferedWriter`
- Exception handling using `try-catch`
- Layout management using `BorderLayout`

## Files Included
- `Notepad.java` – Contains the Java code for the Notepad application.

## Features
- **New:** Creates a blank text area.
- **Open:** Opens an existing text file.
- **Save:** Saves the current text into a file.
- **Exit:** Closes the application.
- **Cut:** Removes selected text and copies it to the clipboard.
- **Copy:** Copies selected text.
- **Paste:** Inserts copied text.
- **Select All:** Selects all the text in the text area.
- **Scrollable Text Area:** Allows users to navigate through longer documents.

## How the Program Works
1. The constructor creates a window titled "Simple Notepad" with a size of 600 × 400 pixels.
2. A `JTextArea` is added inside a `JScrollPane` to provide a scrollable text-editing area.
3. A `JMenuBar` is created with File and Edit menus.
4. Menu items are added for different file and editing operations.
5. Action listeners are registered for all menu items.
6. The `actionPerformed()` method identifies the selected menu item and performs the corresponding operation.
7. File operations use Java I/O classes to read from and write to text files.

## How to Run

### Option 1: Using a Java IDE
1. Open the project in IntelliJ IDEA, Eclipse, or NetBeans.
2. Open `Notepad.java`.
3. Run the program.

### Option 2: Using Terminal or Command Prompt
1. Ensure that the JDK is installed on your system.
2. Save the program as `Notepad.java`.
3. Open Terminal (macOS/Linux) or Command Prompt (Windows).
4. Navigate to the directory containing the file.
5. Compile the program:

   ```bash
   javac Notepad.java
   ```

6. Run the program:

   ```bash
   java Notepad
   ```

## Expected Output
A graphical window titled **Simple Notepad** appears with a blank text-editing area and two menus: File and Edit.

Users can create, open, save, and edit text documents using the available menu options.

## Sample Output
<img width="936" height="624" alt="image" src="https://github.com/user-attachments/assets/788a4df7-4fc1-4711-b18c-ede787bb312c" />

## Result
The Java Swing Notepad application is successfully created with basic text-editing and file-handling functionalities.
