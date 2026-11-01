# Practical 06: Remote Method Invocation (RMI) in Java
Create functions like multiply, addition and subtraction respectively. Invoke these functions from remote system by using the concept of Remote Method Invocation in Java.

## Technologies Used
- Java
- Java RMI (Remote Method Invocation)
- Java Networking

## Concepts Used
- Remote Method Invocation (RMI)
- Remote interfaces
- `Remote` interface
- `RemoteException`
- `UnicastRemoteObject`
- RMI Registry
- `LocateRegistry`
- `Naming.rebind()`
- `Naming.lookup()`
- Client-Server Architecture
- Exception handling using `try-catch`

## Files Included
- `Calculator.java` – Defines the remote interface and declares the arithmetic methods.
- `CalculatorImpl.java` – Implements the remote interface and provides the definitions of arithmetic operations.
- `CalculatorServer.java` – Creates the remote object and registers it with the RMI Registry.
- `CalculatorClient.java` – Connects to the remote calculator service and invokes its methods.

## Features
- Remote addition of two integers.
- Remote subtraction of two integers.
- Remote multiplication of two integers.
- Communication between client and server using Java RMI.
- Results returned from remote method calls.

## How the Program Works

### Server Side
1. Creates an instance of `CalculatorImpl`.
2. Starts the RMI Registry on port 1099 using `LocateRegistry.createRegistry(1099)`.
3. Registers the remote object with the name `CalculatorService` using `Naming.rebind()`.
4. Waits for remote method requests from clients.

### Client Side
1. Looks up the remote object using `Naming.lookup()`.
2. Obtains a reference to the remote calculator service.
3. Passes two integer values, 20 and 10, to the remote methods.
4. Invokes the addition, subtraction, and multiplication methods.
5. Displays the results returned by the server.

## How to Run

### Option 1: Using a Java IDE
1. Open the project in IntelliJ IDEA, Eclipse, or NetBeans.
2. Keep all four Java files in the same project and package.
3. Run `CalculatorServer.java` first.
4. Wait until the message `Calculator Server is ready.` appears.
5. Run `CalculatorClient.java`.
6. Observe the results in the client console.

### Option 2: Using Terminal or Command Prompt

1. Ensure that the JDK is installed on your system.
2. Save all four Java files in the same directory.
3. Open Terminal or Command Prompt in that directory.
4. Compile all four files:

   ```bash
   javac Calculator.java CalculatorImpl.java CalculatorServer.java CalculatorClient.java
   ```

5. Open two separate Terminal or Command Prompt windows.

6. In the first terminal, start the server:

   ```bash
   java CalculatorServer
   ```

7. In the second terminal, start the client:

   ```bash
   java CalculatorClient
   ```

8. Observe the output displayed in the client terminal.

**Note:** Always start the server before running the client. Both programs use `localhost`, so they must run on the same computer for the current implementation.

## Sample Output

### Server Console
<img width="468" height="93" alt="image" src="https://github.com/user-attachments/assets/9337e59c-01fe-4bdc-89d7-e93d2e375c15" />

### Client Console
<img width="936" height="82" alt="image" src="https://github.com/user-attachments/assets/f2f9b0d2-f960-4b78-a726-8833824502d1" />

## Result
The Java RMI calculator is successfully implemented, demonstrating remote method invocation between a client and server to perform arithmetic operations.
