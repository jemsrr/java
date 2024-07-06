import java.util.Scanner;

public class J44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int i = sc.nextInt();
        float[] arr = new float[i];
        for (int j = 0; j < i; j++) {
            System.out.printf("Enter a number %d : ", j + 1);
            arr[j] = sc.nextFloat();
        }
        sc.close();
        standardDeviation(arr, i);
    }

    public static void standardDeviation(float[] arr, int i) {
        float sum = 0;
        float sd = 0;
        for (float add : arr) {
            sum += add;
        }
        float mean = sum / i;
        for (float num : arr) {
            sd += Math.pow(num - mean, 2);
        }
        double standardDeviation = Math.sqrt(sd / i);

        System.out.println(standardDeviation);
    }
}
