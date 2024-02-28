import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLang = scanner.nextInt();
        int[] arr = new int[arrLang];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        int maxValue = -1;
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }

        }
        int[] index = new int[maxValue + 1];
        for (int num : arr) {
            index[num]++;
        }
        int maxIndex = -1;
        for (int i = 0; i < index.length; i++) {
            if (maxIndex < index[i]) {
                maxIndex = index[i];
            }

        }
        if (maxIndex <= 1) {
            System.out.println("there are no numbers that repeat more than 1 time");

        } else {
            for (int i = 0; i < index.length; i++) {
                if (index[i] == maxIndex) {
                    System.out.println("number " + i + " repeated " + maxIndex + " times.");
                }

            }
        }
    }
}
