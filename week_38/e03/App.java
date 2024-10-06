package e03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your age");
        int age = scanner.nextInt();
        System.out.println("Today is a weekend. Is it true or false?");
        boolean weekend = scanner.nextBoolean();
        scanner.close();

        if ((age < 18 || age > 65) && !weekend) {
            System.out.println("You can get a discounted movie ticket.");
        } else {
            System.out.println("You cannot get a discounted movie ticket.");
        }
    }
}
