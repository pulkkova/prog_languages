public class App {
    public static void main(final String[] args) {
        int number = -1;
        boolean a = number > 0;
        boolean b = number < 10;
        boolean c = a && b;
        boolean d = !c;
        boolean e = a || b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println('\n');

        int number1 = 0;
        boolean a1 = number1 > 0;
        boolean b1 = number1 < 10;
        boolean c1 = a1 && b1;
        boolean d1 = !c1;
        boolean e1 = a1 || b1;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println('\n');

        int number2 = 1;
        boolean a2 = number2 > 0;
        boolean b2 = number2 < 10;
        boolean c2 = a2 && b2;
        boolean d2 = !c2;
        boolean e2 = a2 || b2;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(e2);
        System.out.println('\n');

        int number3 = 9;
        boolean a3 = number3 > 0;
        boolean b3 = number3 < 10;
        boolean c3 = a3 && b3;
        boolean d3 = !c3;
        boolean e3 = a3 || b3;
        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);
        System.out.println(d3);
        System.out.println(e3);
        System.out.println('\n');

        int number4 = 10;
        boolean a4 = number4 > 0;
        boolean b4 = number4 < 10;
        boolean c4 = a4 && b4;
        boolean d4 = !c4;
        boolean e4 = a4 || b;
        System.out.println(a4);
        System.out.println(b4);
        System.out.println(c4);
        System.out.println(d4);
        System.out.println(e4);

    }
}

/*
 * Boolean logic answers
 * | -1 |false|true |false|true |true |
 * | 0 |false|true |false|true |true |
 * | 1 |true |true |true |false|true |
 * | 9 |true |true |true |false|true |
 * | 10 |true |false|false|true |true |
 */