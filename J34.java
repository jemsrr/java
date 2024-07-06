import java.util.Scanner;

public class J34 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter natural number = ");
        int n = number.nextInt();
        number.close();
        int sum = sumofNN(n);
        System.out.println(sum);
    }

    public static int sumofNN(int n) {
        if (n != 0) {
            return n + sumofNN(n-1);
        } else {
            return n;
        }
    }
}
