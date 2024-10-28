import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        int n, r, temp, sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        temp = n;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + (int) Math.pow(r, 3);
            temp = temp / 10;

        }
        if (n == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }

}
