package e03;

public class App {
    public static void main(final String[] args) {

        for (int i = 1; i <= 6; i++) {

            for (int y = i; y < 6; y++) {
                System.out.print(" ");
            }

            for (int x = 1; x <= i; x++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
