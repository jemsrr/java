import java.util.Scanner;

public class J37 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a binary number  = ");
        long n = number.nextLong();
        number.close();
        int octal = binarytooctal(n);
        System.out.println(octal);
    }

    public static int binarytooctal(long n) {
        int octaln = 0, decimal = 0,i=0;
        while (n != 0) {
            decimal += (n % 10) * Math.pow(2, i);
            ++i;
            n /=10;
        }
        
        // i = 1;
        // while (decimal != 0) {
        //     octaln += (decimal %8)*i;
        //     decimal /= 8;
        //     i *= 10;
        // }
        return decimal;
    }
}
