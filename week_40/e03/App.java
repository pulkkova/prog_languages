package e03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        scanner.close();

        int i = name.length()-1;

        while (i != -1) {
            System.out.println(name.charAt(i));
            i--;
        }

    }
}