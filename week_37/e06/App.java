public class App {
    public static void main(final String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        boolean and = isJavaFun && isFishTasty;
        boolean or = isJavaFun || isFishTasty;
        boolean not1 = !isFishTasty;
        boolean not2 = !isJavaFun;

        System.out.println(and);
        System.out.println(or);
        System.out.println(not1);
        System.out.println(not2);

    }
}
