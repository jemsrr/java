import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        double root1, root2;
        Scanner num = new Scanner(System.in);

        System.out.print("Enter a value of a = ");
        float a = num.nextFloat();
        System.out.print("Enter a value of b = ");
        float b = num.nextFloat();
        System.out.print("Enter a value of c = ");
        float c = num.nextFloat();

        float D = b * b - 4 * a * c;

        if (D > 0) {
            root1 = (-b + Math.sqrt(D)) / (2 * a);
            root2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.format("root1 = %f and root2 = %f", root1, root2);
        } else if (D == 0) {
            root1 = root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.format("root1 = root2 = %f", root1);
        } else {
            float real = -b / (2 * a);
            Double imaginary = Math.sqrt(-D) / (2 * a);
            System.out.format("root1 = %f+%fi", real, imaginary);
            System.out.format("root2 = %f-%fi", real, imaginary);
        }
    }
}
