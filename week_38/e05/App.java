package e05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What day of the week is it today? ");
        String day = scanner.next().toUpperCase();
        scanner.close();

        enum Weekday {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        Weekday weekday = Weekday.valueOf(day);

        switch (weekday) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("Enjoy the weekend!");
                break;
            case MONDAY:
                System.out.println("Have a good start of the week!");
                break;
            case TUESDAY:
                System.out.println("Have a good day!");
                break;
            case WEDNESDAY:
                System.out.println("Have a good wednesday!");
                break;
            case THURSDAY:
                System.out.println("Have a good day before friday!");
                break;
            case FRIDAY:
                System.out.println("Have a good last day of the work week!");
                break;

        }

    }
}
