import java.util.Scanner;

public class J11 {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = year.nextInt();

        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println(y + " is a leap year");
                } else {
                    System.out.println(y + " is a not leap year");
                }
            } else {
                System.out.println(y + " is a leap year");
            }

        } else {
            System.out.println(y + " is a not leap year");
        }
    }
}
