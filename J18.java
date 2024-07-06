import java.util.Scanner;

public class J18 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = num.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = num.nextInt();

        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}
