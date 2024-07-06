import java.util.Scanner;

public class J31 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = num.nextInt();
        fi(n);

    }

    public static void fi(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
