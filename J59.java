import java.util.Arrays;
import java.util.Scanner;

public class J59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array 1: ");
        int a1L = sc.nextInt();
        System.out.print("Enter a size of array 2: ");
        int a2L = sc.nextInt();

        int[] arr1 = new int[a1L];
        for (int i = 0; i < a1L; i++) {
            System.out.printf("Enter %d element of array 1 :",i+1);
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[a2L];
        for (int i = 0; i < a2L; i++) {
            System.out.printf("Enter %d element of array 2 :",i+1);
            arr2[i] = sc.nextInt();
        }

        int[] result = new int[a1L + a2L];

        System.arraycopy(arr1, 0, result, 0, a1L);
        System.arraycopy(arr2, 0, result, a1L, a2L);

        System.out.println(Arrays.toString(result));
    }
}
