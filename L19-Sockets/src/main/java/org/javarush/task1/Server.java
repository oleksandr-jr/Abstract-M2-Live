package org.javarush.task1;

import java.net.ServerSocket;
import java.net.Socket;

/*
Сокетний сервер і клієнт
*/

public class Server {

    public static void main(String[] args) {
        int port = 4444;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket socket = serverSocket.accept();
                new Handler(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

            try (Connection connection = new Connection(socket)) {
                while (true) {
                    String message = connection.receive();

                    if (message.equals("exit")) {
                        break;
                    }

                    System.out.println(message);

                    connection.send("Echo: " + message);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
