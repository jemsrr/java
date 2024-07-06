import java.util.Scanner;

public class J48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of array : ");
        int row = sc.nextInt();
        System.out.print("Enter column of array : ");
        int column = sc.nextInt();
        double[][] arr = new double[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter a value of array[%d][%d] : ", i, j);
                arr[i][j] = sc.nextDouble();
            }
        }
        double[][] newarr = new double[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                newarr[i][j] = arr[j][i];
                System.out.print(newarr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
