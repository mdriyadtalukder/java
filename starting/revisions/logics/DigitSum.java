import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        int n, r, temp, sum = 0;
        try (Scanner sc = new Scanner(System.in);) {
            n = sc.nextInt();
        }
        temp = n;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;

        }
        System.out.println(sum);
    }
}