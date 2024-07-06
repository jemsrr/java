import java.util.Scanner;

public class J51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int i = sc.nextInt();
        String[] arr = new String[i];
        for (int j = 0; j < i; j++) {
            System.out.printf("Enter a elements %d: ", j + 1);
            arr[j] = sc.next();
        }
        sc.close();
        for (int j = 0; j < i - 1; j++) {
            for (int j2 = j + 1; j2 < i; j2++) {
                if (arr[j].compareTo(arr[j2]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j2];
                    arr[j2] = temp;
                }
            }

        }
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
    }
}
