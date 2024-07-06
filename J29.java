import java.util.Scanner;

public class J29 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter low value : ");
        int low = num.nextInt();
        System.out.print("Enter high value : ");
        int high = num.nextInt();

        while (low < high) {

            if (name(low)) {
                System.out.print(low + " ");
            }
            ++low;
        }

    }

    public static boolean name(int low) {
        boolean f = true;
        for (int i = 2; i < low / 2; i++) {

            if (low % i == 0) {
                f = false;
                break;
            }
        }
        return f;
    }
}
