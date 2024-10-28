public class Bitwises {
    public static void main(String[] args) {
        int a = 32;
        int b = 12;

        int c = a & b; // convert a and b into binary then multiply a value of a with a value of b
                       // according to order
        int d = a | b; // convert a and b into binary then addition a value of a with a value of b
                       // according to order
        int e = a ^ b; // convert a and b into binary then 1 will be if the value order pair will be
                       // 0,1 otherwise it will be 0
        int f = a >> 3; // convert a into binary then it will be back 3 index..so it means a k 2 dara 3
                        // bar vag dite hbe
        int g = a << 3; // convert a into binary then it will be extend 3 index..so it means a er new
                        // value guli k 3 bar 2 tara gun krte hbe

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
