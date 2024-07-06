import java.util.Scanner;

public class J42 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int i = number.nextInt();
        float[] arr = new float[i];
        for (int j = 0; j < i; j++) {
            System.out.printf("Enter a number %d : ",j+1);
            arr[j] = number.nextFloat();
        }
        number.close();
        float sum = 0;

        for (float f : arr) {
            sum += f;
        }

        float a = sum / i;
        System.out.println(a);
    }
}
