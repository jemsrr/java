import java.util.Scanner;

public class J22 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = number.nextInt();
        int n = 0;

        while (num != 0) {
            int digit = num % 10;
            n = n * 10 + digit;
            num /= 10;
        }
        System.out.println(n);
    }
}
