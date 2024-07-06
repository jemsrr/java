import java.util.Scanner;

public class J33 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = number.nextInt();
        sumOfprime(n);
        number.close();
    }

    public static boolean primeNum(int m) {
        boolean f = true;
        for (int i = 2; i <= m / 2; ++i) {
            if (m % i == 0) {
                f = false;
                break;
            }
        }
        return f;
    }

    public static void sumOfprime(int n) {
        boolean f = false;
        for (int i = 0; i <= n / 2; i++) {
            if (primeNum(i)) {
                if (primeNum(n - i)) {
                    System.out.printf("%d = %d + %d\n", n, i, n - i);
                    f = true;
                }
            }
        }
        if (!f) {
            System.out.println(n + " cannot be eapressed");
        }
    }
}
