public class FunctionMethod {
    static float sum(int a, float b) {
        float r = a + b;
        return r;
    }

    static void name() {
        System.out.println("My name is riyad");
    }

    static void line(String a) { // void hbe jdi kono value return na kri..
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 5;
        float f = 6.786f;
        float result = sum(a, f);
        System.out.println(result);
        name();
        line("Who are you?");
    }
}