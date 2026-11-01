# Practical 08: Java Applet Login Form Using JDBC
The input entered in these fields should be stored in the database. Use JDBC connectivity for implementing this program.

## Files Included

| File Name | Description |
|---|---|
| `LoginApplet.java` | Basic login form using Java Applet and AWT. |
| `LoginApplet.html` | HTML file used to run the basic login applet. |
| `LoginAppletJDBC.java` | JDBC-enabled login form that stores user details in MySQL. |
| `LoginAppletJDBC.html` | HTML file used to run the JDBC-enabled applet. |

## Technologies Used
- Java
- Java Applet
- AWT (Abstract Window Toolkit)
- JDBC (Java Database Connectivity)
- MySQL
- MySQL Connector/J

## Database Configuration

**Database Name:** `LoginDB`

**Table Name:** `Users`

The `Users` table contains the following columns:

| Column | Data Type | Description |
|---|---|---|
| id | INT | Primary key with AUTO_INCREMENT |
| name | VARCHAR(100) | Stores the user's name |
| password | VARCHAR(100) | Stores the user's password |

### SQL Commands

```sql
CREATE DATABASE LoginDB;

USE LoginDB;

CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(100)
);
```

## Execution Steps

1. Create the database and the `Users` table in MySQL.
2. Ensure that MySQL Connector/J is available in the Java classpath.
3. Compile the Java files using Java 8.
4. Run the corresponding HTML files using `appletviewer`.
5. Enter the name and password in the login form.
6. Click the Submit button.
7. In the JDBC implementation, the entered details are inserted into the MySQL database.

## Sample Output
<img width="796" height="490" alt="image" src="https://github.com/user-attachments/assets/df78b70f-c8c7-41b9-9cdf-7cbe5ea03ec1" />
<img width="798" height="478" alt="image" src="https://github.com/user-attachments/assets/5355af9f-0661-4405-b5fd-7ca59b6d2dba" />
<img width="936" height="398" alt="image" src="https://github.com/user-attachments/assets/75a2f0d0-c2ef-4797-b9c2-9723906867f2" />
<img width="936" height="254" alt="image" src="https://github.com/user-attachments/assets/7d334605-1a64-4dde-9f7b-e88dd334d342" />

## Result
The practical demonstrates how Java Applets and AWT can be used to create a graphical login form and how JDBC connectivity enables Java applications to interact with a MySQL database and store user information.
