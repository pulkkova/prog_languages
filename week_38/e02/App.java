package e02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        scanner.close();

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
            case 7:
                System.out.println("Good Job!");
                break;
            case 6:
            case 5:
                System.out.println("Needs Improvement.");
                break;
            default:
                System.out.println("Fail");
                break;

        }
    }
}
