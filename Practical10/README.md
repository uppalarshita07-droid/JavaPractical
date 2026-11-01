# Practical 10: Implementation of JavaBeans
Write a program to create a bean component in Java for addition of two numbers.

## Files Included

| File | Description |
|---|---|
| `AdditionBean.java` | JavaBean class containing the data members, getter and setter methods, and addition logic. |
| `TestBean.java` | Main class used to test the JavaBean and display the result. |

## Concepts Used
- JavaBeans
- Encapsulation
- Serializable interface
- Getter and setter methods
- Object creation
- Method invocation

## How to Compile and Run

1. Open the terminal in the Practical 09 folder.
2. Compile both Java files:

```bash
javac AdditionBean.java TestBean.java
```

3. Run the test class:

```bash
java TestBean
```

## Sample Output
<img width="468" height="91" alt="image" src="https://github.com/user-attachments/assets/4e280150-89da-43e8-a049-c45863e690c9" />

## Result
The practical successfully demonstrates the implementation of JavaBeans in Java. It shows how private data members can be accessed and modified through public getter and setter methods, and how a JavaBean object can be reused in another class to perform a simple addition operation.
