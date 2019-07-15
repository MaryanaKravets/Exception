package main.java.server;

import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some word: ");
        String string = scanner.next();
        try {
            OptionalServer.checkOnPalindrom(string);
            System.out.println("You entered a palindrom!\n");
        } catch (NotPalindromException ex) {
            ex.printStackTrace();
        }
        System.out.println("Enter a number:");
        Integer integer = scanner.nextInt();
        try {
            OptionalServer.checkOnEvenAndGreater(integer);
            System.out.println("You entered even number!\n");
        } catch (NotEvenException | GreaterThanHundredException ex) {
            ex.printStackTrace();
        }
        System.out.println("Enter an object: ");
        Object object = scanner.next();
        try {
            OptionalServer.checkOnNull(object);
            System.out.println("You entered not null");
        } catch (NullObjectException ex) {
            ex.printStackTrace();
        }
    }
}
