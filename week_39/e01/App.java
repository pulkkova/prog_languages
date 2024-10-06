package e01;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplication table to show?"); 
        int multi = scanner.nextInt();
        scanner.close();

        int i = 0;
        while(i<=10) {
            System.out.println(i + " x " + multi + " = " + i*multi);
            i++;
        }

    }
}
