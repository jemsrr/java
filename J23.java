import java.util.Scanner;

public class J23 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter value of base: ");
        int base = n.nextInt();
        System.out.print("Enter value of exponent: ");
        int exponent = n.nextInt();
        int power = 1;

        while (exponent > 0) {
            power *= base;
            exponent--;
        }
        System.out.println(power);
    }
}