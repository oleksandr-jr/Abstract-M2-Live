package org.javarush;


// 5! = 1 * 2 * 3 * 4 * 5
// 6! = 1 * 2 * 3 * 4 * 5 * 6
// 12! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Node node4 = new Node(4, 98, null, null);
        Node node3 = new Node(3, 87, null, null);

        Node node1 = new Node(1, 67, node3, node4);

        Node node2 = new Node(2, 50, null, new Node(5, 40, null, null));

        Node node0 = new Node(0, 10, node1, node2);


//        discoverNodeTree(node0);

        File project = new File("/Users/OleksandrJR/Documents/JavaRushProjects/ABSTRACT_UA/Module_2/Abstract-M2-Live");

        printAllFiles(project);


    }


    private double calculate(int x, int n) {
        if (n == 1) {
            return x;
        } else {
            double result = x;
            for (int i = 2; i <= n; i++) {
                result *= x;
            }
            return result / n;
        }
    }

    public static void printAllFiles(File dir) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                printAllFiles(file);
            } else {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    public static void discoverNodeTree(Node node) {
        if (node == null) {
            return;
        }

        System.out.printf("Node: %d value = %d%n", node.getId(), node.getValue());

        discoverNodeTree(node.getLeft());
        discoverNodeTree(node.getRight());
    }


    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static int factorial(int number) {
        if (number == 0) return 1;
        if (number == 1 || number == 2) {
            return number;
        } else {
            int nextNumber = factorial(number - 1);

            return number * nextNumber;
        }

    }


    public static void countDown(int x) {
        int a = 100;
        a--;
        System.out.println(a - 1);
        if (x <= 0) {
            System.out.println("Boom!");
        } else {
            System.out.println(x);
            countDown(x - 1);
        }
        System.out.println("end: " + x);
        a--;
        System.out.println("asdasdas: " + a);
    }

    public static void recursiveMethod(int x) {
        int count = x + 1;
        System.out.println(count);

        recursiveMethod(count);
    }
}