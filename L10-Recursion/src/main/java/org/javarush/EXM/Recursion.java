package org.javarush.EXM;

public class Recursion {

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        int number = 10;
        int factorial = calculateFactorial(number);
        System.out.println("Факторіал числа " + number + " = " + factorial);

        System.out.println("Число Фібоначчі для " + number + " = " + fibonacci(number));
    }

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void runThree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Обхід по дереву (pre-order):");
        discoverThreeNode(root);
    }


    public static void discoverThreeNode(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " "); // Виведення значення поточного вузла
        discoverThreeNode(node.left); // Рекурсивний виклик для лівого піддерева
        discoverThreeNode(node.right); // Рекурсивний виклик для правого піддерева
    }

    public static void recursiveMethod(int count) {
        int currentCount = count++;
        System.out.println(currentCount);
        recursiveMethod(currentCount);
    }
}


