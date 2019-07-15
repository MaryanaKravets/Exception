package main.java.stackoverfl;

public class StackOverFl {
    public static void main(String[] args) {
        recursion(10000);
    }

    private static int recursion(int n) {
        System.out.println("Number: " + n);
        if (n == 0) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }
}
