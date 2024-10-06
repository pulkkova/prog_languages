package e05;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int score;
        double avg = 0;

        do {
            System.out.println("Give a test score (-1 to quit):");
            score = scanner.nextInt();

            if (score == -1) {
                System.out.println("Summary");
                System.out.println("-------");
                System.out.println("Tests:" + i);
                System.out.println("Average: " + avg);
                break;
            } else {
                sum += score;
                i++;
                avg = (double) sum / i;
                System.out.println("Average: " + avg);
            }

        } while (score != -1);
        scanner.close();
    }
}
