import java.util.Scanner;

public class J27 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = num.nextInt();
        int nu = n;
        int s = 0, r;

        while (nu != 0) {
            r = nu % 10;
            s += Math.pow(r, 3);
            nu /= 10;
        }
        if (s == n) {
            System.out.println(n + " is a armstrong number");
        } else {
            System.out.println(n + " is a not armstrong number");
        }
    }
}
