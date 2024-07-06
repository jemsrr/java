import java.util.Scanner;

public class J5 {
    public static void main(String[] args) {
        Scanner dividend = new Scanner(System.in);
        System.out.print("Enter a Dividend: ");
        float dd = dividend.nextFloat();

        Scanner divisor = new Scanner(System.in);
        System.out.print("Enter a Divisor: ");
        float ds = divisor.nextFloat();

        float quotient = dd / ds;
        float remainder = dd % ds;

        int q = (int) quotient;

        System.out.println("quotient = " + q);
        System.out.println("remainder = " + remainder);
    }
}
