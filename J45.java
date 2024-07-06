import java.util.Scanner;

public class J45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of array : ");
        int r = sc.nextInt();
        System.out.print("Enter column of array : ");
        int c = sc.nextInt();
        float[][] arr1 = new float[r][c];
        float[][] arr2 = new float[r][c];

        for (int j = 0; j < r; j++) {
            for (int k = 0; k < c; k++) {
                System.out.printf("Enter a number %d%d of matrix 1: ", j + 1, k + 1);
                arr1[j][k] = sc.nextFloat();
            }
        }

        for (int j = 0; j < r; j++) {
            for (int k = 0; k < c; k++) {
                System.out.printf("Enter a number %d%d of matrix 2 : ", j + 1, k + 1);
                arr2[j][k] = sc.nextFloat();
            }
        }
        sumofArr(arr1, arr2, r, c);
    }

    public static void sumofArr(float[][] arr1, float[][] arr2, int r, int c) {
        float[][] sum = new float[r][c];
        for (int j = 0; j < r; j++) {
            for (int k = 0; k < c; k++) {
                sum[j][k] = arr1[j][k] + arr2[j][k];
                System.out.print(sum[j][k] + "\t");
            }
            System.out.println();
        }

        // for (int j = 0; j < r; j++) {
        //     for (int k = 0; k < c; k++) {
        //         System.out.print(sum[j][k]);
        //     }
        // }
    }
}
