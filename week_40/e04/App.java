package e04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        scanner.close();

        for (int i = name.length()-1; i>=0;  i-=2) {
            System.out.println(name.charAt(i));
        }

    }
}