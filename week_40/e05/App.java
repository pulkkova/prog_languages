package e05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               
        while(true) {
            System.out.println("Enter a name:");
            String name = scanner.nextLine();
            if (name.equals("Quit")) {
                break;
            }
        }
        scanner.close();
    }
}