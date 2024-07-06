import java.util.Scanner;

public class J46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of array 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter column of array 1: ");
        int c1 = sc.nextInt();
        System.out.print("Enter row of array 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter column of array 2: ");
        int c2 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];
        if (r2 == c1) {
            int n = c1;
            for (int j = 0; j < r1; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.printf("Enter a number %d%d of matrix 1: ", j + 1, k + 1);
                    arr1[j][k] = sc.nextInt();
                }
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < c2; k++) {
                    System.out.printf("Enter a number %d%d of matrix 2 : ", j + 1, k + 1);
                    arr2[j][k] = sc.nextInt();
                }
            }
            muxofArr(arr1, arr2, r1, n, c2);
        }

    }

    public static void muxofArr(int[][] arr1, int[][] arr2, int r, int n, int c) {
        int[][] mux = new int[r][c];
        for (int j = 0; j < r; j++) {
            for (int k = 0; k < c; k++) {
                for (int i = 0; i < n; i++) {
                    mux[j][k] += arr1[j][i] * arr2[i][k];
                }
                System.out.print(mux[j][k] + "\t");
            }
            System.out.println();
        }

        
    }
}
