import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int[] arr1 = new int[arrLength];
        arr1[0]=0;
        arr1[1]=1;
        for (int i = 2; i <arr1.length ; i++) {
            arr1[i]=arr1[i-1]+arr1[i-2];

        }
        System.out.println(Arrays.toString(arr1));
    }
}
