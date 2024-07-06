import java.beans.FeatureDescriptor;
import java.util.Scanner;

public class J15 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter naturat number: ");
        int n = num.nextInt();
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("sum of natural number = " + f);
    }
}
