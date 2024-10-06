package e01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        scanner.close();

        String louis = "Louis";

        if (name.equals(louis)) {
            System.out.println("Are you French?");
        } else {
            System.out.println("You have a great name!");
        }
    }
}
