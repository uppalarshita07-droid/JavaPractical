# Practical 04: Client-Server Communication Using TCP in Java
Write a program to design a calculator using the AWT controls provided in Java.

## Technologies Used
- Java
- Java I/O
- Java Networking (`java.net`)

## Concepts Used
- Client-Server Architecture
- TCP Protocol
- Socket Programming
- `Socket` class
- `ServerSocket` class
- `BufferedReader` for receiving data
- `PrintWriter` for sending data
- Input and Output Streams
- Port numbers
- Exception handling

## Files Included
- `Server.java` – Creates the server, accepts client connections, receives messages, and sends a response.
- `Client.java` – Establishes a connection with the server, sends a message, and receives the server's response.

## How the Program Works

### Server Side
1. Creates a `ServerSocket` on port 5001.
2. Waits for a client connection using `accept()`.
3. Receives the message sent by the client.
4. Displays the received message.
5. Sends a reply to the client.
6. Closes the socket and server socket.

### Client Side
1. Creates a socket connection with the server using `localhost` and port 5001.
2. Establishes input and output streams.
3. Sends the message "Hello Server!" to the server.
4. Receives the server's reply.
5. Displays the reply on the console.
6. Closes the connection.

## How to Run

### Option 1: Using a Java IDE
1. Open the project in IntelliJ IDEA, Eclipse, or NetBeans.
2. Keep `Client.java` and `Server.java` in the same project.
3. Run `Server.java` first.
4. Once the server displays the waiting message, run `Client.java`.
5. Observe the communication messages in both consoles.

### Option 2: Using Terminal or Command Prompt
1. Ensure that the JDK is installed.
2. Save both files (`Client.java` and `Server.java`) in the same directory.
3. Open Terminal or Command Prompt in that directory.
4. Compile both programs:

   ```bash
   javac Server.java Client.java
   ```

5. Open two separate Terminal or Command Prompt windows.

6. In the first terminal, start the server:

   ```bash
   java Server
   ```

7. In the second terminal, start the client:

   ```bash
   java Client
   ```

8. Observe the messages displayed in both terminals.

**Note:** Always run the server before running the client because the server must be ready to accept the connection.

## Sample Output

### Server Console

<img width="936" height="134" alt="image" src="https://github.com/user-attachments/assets/bd6d0435-a404-4694-b072-8bf098bdafcb" />


### Client Console

<img width="936" height="130" alt="image" src="https://github.com/user-attachments/assets/f1b5cd56-d82c-45a9-9eb6-5d8df70287da" />

## Important Points
- `localhost` refers to the same computer on which the programs are running.
- Port `5001` is used for communication between the client and server.
- TCP provides reliable and connection-oriented communication.
- The server must be running before the client attempts to connect.
- Both programs must use the same port number.

## Result
The client and server successfully establish a TCP connection and exchange messages using Java socket programming.
