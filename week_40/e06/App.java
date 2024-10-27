package e06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter:");
        String entered = scanner.nextLine();

        String sentence;

        sentence = entered.replaceAll(",", "");
        sentence = sentence.replaceAll(" ", "");

        String s1 = sentence.substring(0, sentence.length() / 2);

        String s2;
        if (sentence.length() % 2 == 0) {
            s2 = sentence.substring(sentence.length() / 2);
        } else {
            s2 = sentence.substring(sentence.length() / 2 + 1);
        }

        s2 = new StringBuilder(s2).reverse().toString();

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println(entered + " is a palindrome");
        } else {
            System.out.println(entered + " is not a palindrome " + s1 + s2);
        }

        scanner.close();

    }
}