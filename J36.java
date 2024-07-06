import java.util.Scanner;

public class J36 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number 1 = ");
        int n1 = number.nextInt();
        System.out.print("Enter a number 2 = ");
        int n2 = number.nextInt();
        number.close();
        int r;
        r = gcd(n1, n2);
        System.out.println(r);
        
        

    }
    public static int gcd(int x, int y) {
        if (y != 0) {
            return gcd(y,x%y);
        } else {
            return x;
        }
    }
}
