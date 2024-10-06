package e02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        scanner.close();

        int i = 0;

        while (i != name.length()) {
            System.out.println(name.charAt(i));
            i++;
        }

    }
}
