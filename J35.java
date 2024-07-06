import java.util.Scanner;

public class J35 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter natural number = ");
        int n = number.nextInt();
        number.close();
        int f = f(n);
        System.out.println(f);
    }

    public static int f(int n) {
        if (n >= 1) {
            return n * f(n-1);
        } else {
            return 1;
        }
    }
}
