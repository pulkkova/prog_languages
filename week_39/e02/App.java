package e02;


public class App {
    public static void main(final String[] args) {

        for (int i = 1, q = 3; i <= 7; i += 2, q--) {
            String spaces = " ";
            spaces = spaces.repeat(q);

            String aster = "*";
            aster = aster.repeat(i);
            System.out.println(spaces + aster + spaces);

        }
    }
}
