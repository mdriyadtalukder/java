import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int n;
            float f;
            double d;
            String s;

            System.out.println("Enter the number: ");
            n = input.nextInt();

            // Consume the leftover newline character
            input.nextLine();
            System.out.println("Enter  String: ");
            // s=input.next(); just 1st word print hbe..like "md riyad"..just md print hbe;
            s = input.nextLine();

            System.out.println("Enter the float number: ");
            f = input.nextFloat();
            System.out.println("Enter the double number: ");
            d = input.nextDouble();
            System.out.println("Number: " + n);
            System.out.println("float: " + f);
            System.out.println("double: " + d);
            System.out.println("string: " + s);
        }

    }
}
