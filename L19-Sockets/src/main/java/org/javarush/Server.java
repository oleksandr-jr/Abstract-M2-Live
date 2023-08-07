package org.javarush;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3000);
        System.out.println("Server started");
        // localhost
        while (true){
            Socket socket = serverSocket.accept();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));

            String message = reader.readLine();
            System.out.println("from " + socket.getInetAddress());
            System.out.println("Message: " + message);

            String answer = String.format("Hello, from server. Your message was: %s", message);

            writer.write(answer);
            writer.flush();

            socket.close();
        }
    }
}
