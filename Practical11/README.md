# Practical 11: Student Login System Using JDBC
Reuse the above form to perform basic database operations (CRUD) using JDBC.

## Files Included

| File | Description |
|---|---|
| `StudentLogin1.java` | Java Applet source code containing the login interface and JDBC CRUD operations. |
| `StudentLogin1.html` | HTML file used to launch the Java Applet. |
| `mysql-connector-j-26.10.0.jar` | MySQL JDBC driver required for database connectivity. |

## Technologies Used
- Java
- AWT (Abstract Window Toolkit)
- Java Applet
- JDBC (Java Database Connectivity)
- MySQL
- HTML

## Database Configuration

**Database Name:** `LoginDB`

**Table Name:** `Users`

The following SQL commands are used to create the database and table:

```sql
CREATE DATABASE LoginDB;

USE LoginDB;

CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(100)
);
```

## How to Compile and Run

1. Open the terminal in the project folder.
2. Compile the Java program using:

```bash
javac -cp ".:mysql-connector-j-26.10.0.jar" StudentLogin1.java
```

3. Run the Applet using:

```bash
appletviewer StudentLogin1.html
```

4. Enter the name and password in the respective fields.
5. Use the Insert, View, Update, and Delete buttons to perform the corresponding database operations.

## Sample Output
<img width="802" height="588" alt="image" src="https://github.com/user-attachments/assets/c0ef2557-2538-4ddd-aa5a-4ec7a7911544" />

## Result
The practical successfully demonstrates JDBC connectivity between a Java Applet and a MySQL database. It implements all four CRUD operations using SQL queries and `PreparedStatement`, providing a basic example of database management through a Java application.
