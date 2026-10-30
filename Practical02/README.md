# Practical02: String Animation Using Multithreading in Java
Write a program to animate a string on Applet. Use the concept of Multithreading.

## Technologies Used
- Java
- Java AWT (Abstract Window Toolkit)
- HTML

## Concepts Used
- Java Applets
- AWT graphics
- `Runnable` interface
- Multithreading using the `Thread` class
- Applet lifecycle methods: `init()`, `start()`, and `paint()`
- `repaint()` method
- Exception handling using `InterruptedException`
- HTML `<applet>` tag

## Files Included
- `Main.java` – Contains the Java code for the animated string.
- `Main.html` – Embeds the Java Applet in an HTML page.

## How the Program Works
1. The `init()` method sets the background colour to white and the text colour to blue.
2. The `start()` method creates and starts a new thread.
3. The `run()` method moves the text horizontally by increasing its x-coordinate by 10 every 200 milliseconds.
4. When the text moves beyond the applet's width, its x-coordinate is reset to zero.
5. The `repaint()` method requests the applet to redraw the text at its updated position.
6. The `paint()` method displays the string at the current x-coordinate and a fixed y-coordinate of 100.

## How to Run
**Note:** Java Applets were deprecated and later removed from modern Java versions. This program requires a compatible older Java environment, such as JDK 8, and an appropriate applet viewer.

1. Save the Java program as `Main.java`.
2. Compile the Java file:

   ```bash
   javac Main.java
   ```

3. Save the HTML code as `Main.html`.
4. Ensure that the `codebase` attribute in the HTML file points to the directory containing `Main.class`.
5. Open the HTML file using a compatible applet viewer.

   ```bash
   appletviewer Main.html
   ```

## Expected Result
The Java Applet successfully demonstrates string animation using multithreading and AWT graphics.

## Sample Output
<img width="1430" height="491" alt="image" src="https://github.com/user-attachments/assets/f4c20f9d-47ae-45f8-913a-29745bebe3f4" />
