public class Loops {
    public static void main(String[] args) {

        // loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(+i);
        }
        ;

        // while
        int j = 20;
        while (j <= 30) {
            System.out.println(+j);
            j++;
        }

        // do while
        int k = 40;
        do {
            System.out.println(+k);
            k++;
        } while (k <= 50);
    }
}