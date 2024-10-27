package e07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Create a password:");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean d = false;
            boolean u = false;
            boolean l = false;
            String pass = scanner.nextLine();

            if (pass.length() >= 8) {
                for (int i = 0; i != pass.length() - 1; i++) {

                    if (Character.isDigit(pass.charAt(i))) {
                        d = true;
                    } else if (Character.isLowerCase(pass.charAt(i))) {
                        l = true;
                    } else if (Character.isUpperCase(pass.charAt(i))) {
                        u = true;
                    }
                }

            } else {
                System.out.println("Password is invalid. Needs to be at least 8 characters long.");
                continue;
            }

            if (d && u && l) {
                System.out.println("Your password is valid");
                break;
            } else {
                System.out.println("Try another one!");
                if (!u) {
                    System.out.print("Needs to include at least one uppercase letter.");
                }
                if (!l) {
                    System.out.print("Needs to include at least one lowercase letter.");
                }
                if (!d) {
                    System.out.print("Needs to include at least one digit.");
                }
            }
        }
        scanner.close();
    }
}