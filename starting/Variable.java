public class Variable {
    public static void main(String[] args) {
        boolean b = false;
        char c = 'k';
        short s = 894;
        int i = 209;
        float f = 1.088888888888888888888888f;
        double d = 1.2388888888888888888888888888;
        System.out.println(+i);
        System.out.println(+f);

        System.out.printf("%b\n", b);
        System.out.printf("%c\n", c);
        System.out.printf("%d\n", s);
        System.out.printf("%d\n", i);
        System.out.printf("%.10f\n", f);
        System.out.printf("%.20f", d);
    }
}