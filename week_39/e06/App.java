package e06;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            num = random.nextInt(11);
            System.out.println("Guess a number:");
            int att = scanner.nextInt();

            if (att == num) {
                System.out.println("SUCCESS!");
                break;
            } else if (att < num) {
                System.out.println("Guess was to low");
            } else {
                System.out.println("Guess was to high");
            }
        }
        scanner.close();
    }
}
