import java.util.Scanner;

public class J26 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter low value : ");
        int low = num.nextInt();
        System.out.print("Enter high value : ");
        int high = num.nextInt();

        while (low < high) {
            boolean f = false;

            for (int i = 2; i < low / 2; i++) {
                if (low % i == 0) {
                    f = true;
                    break;
                }
            }
            if (!f && low != 0 && low != 1) {
                System.out.print(low + " ");
            }
            ++low;
        }
    }
}
