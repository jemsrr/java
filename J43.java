import java.util.Scanner;

public class J43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int i = sc.nextInt();
        float[] arr = new float[i];
        for (int j = 0; j < i; j++) {
            System.out.printf("Enter a number %d : ",j+1);
            arr[j] = sc.nextFloat(); 
        }
        sc.close();
        float finalans = arr[0];
        

        for (float f : arr) {
            if (finalans < f) {
                finalans = f;
            }
        }
        System.out.print(finalans);
    }
}
