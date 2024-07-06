import java.util.Scanner;

public class J14 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter naturat number: ");
        int n = num.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("sum of natural number = " + sum);
    }
}
