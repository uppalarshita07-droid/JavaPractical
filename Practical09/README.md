# Practical 09: Student Registration Portal Using JDBC
Write a program to create a small portal which contains the registration form of students. Use JDBC.

The application provides a student registration form with the following fields:
- Name
- Roll Number
- Email
- Phone Number
- Course

When the user fills in the form and clicks the Submit button, the program validates the entered details and stores them in the MySQL database using JDBC.

A `PreparedStatement` is used to execute the SQL INSERT query and securely pass the form data to the database. The application displays a success message when the registration is completed or an error message if something goes wrong.

## Files Included

| File | Description |
|---|---|
| `StudentRegistration.java` | Java source code containing the registration form and JDBC connectivity. |
| `StudentRegistration.html` | HTML file used to run the Java Applet. |
| `StudentRegistration.class` | Compiled Java bytecode. |
| `mysql-connector-j-26.10.0.jar` | MySQL JDBC driver required for database connectivity. |
| `mysql.policy` | Security policy file used while running the Applet. |

## Technologies Used
- Java (AWT and Applet)
- JDBC (Java Database Connectivity)
- MySQL
- HTML
- MySQL Connector/J

## Database Configuration

**Database Name:** `StudentDB`

**Table Name:** `StudentRegistration`

The following SQL commands are used to create the database and table:

```sql
CREATE DATABASE StudentDB;

USE StudentDB;

CREATE TABLE StudentRegistration (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    roll_no VARCHAR(20) UNIQUE,
    email VARCHAR(100),
    phone VARCHAR(15),
    course VARCHAR(100)
);
```

## How to Compile and Run

1. Open the terminal in the Practical 09 folder.
2. Compile the Java program using:

```bash
javac -cp ".:mysql-connector-j-26.10.0.jar" StudentRegistration.java
```

3. Run the Applet using:

```bash
appletviewer -J-Djava.security.policy=./mysql.policy StudentRegistration.html
```

4. Enter the required student details in the registration form.
5. Click the **Submit** button to save the information to the database.

## Sample Output
<img width="936" height="648" alt="image" src="https://github.com/user-attachments/assets/ddd31389-8b4c-4eee-8ffe-48425fa499fb" />
<img width="936" height="646" alt="image" src="https://github.com/user-attachments/assets/f486a8b7-ced5-41a7-81f5-08af5830ae61" />
<img width="936" height="646" alt="image" src="https://github.com/user-attachments/assets/d9328fc1-7eeb-4bb4-9f26-8deadfdcf2da" />
<img width="936" height="314" alt="image" src="https://github.com/user-attachments/assets/5165a95d-2937-43d7-a070-2d815ec3056f" />

## Result
The practical successfully demonstrates the development of a student registration portal using Java Applets and JDBC. It establishes connectivity between a Java application and a MySQL database and stores student registration details using SQL INSERT queries and PreparedStatements.
