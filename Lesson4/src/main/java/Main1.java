import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        double sum = 0;
        for (int ar : arr) {
            sum += ar;
        }
        double averageNum = (sum / arr.length);
        System.out.println("the average value "+averageNum);

        int[] reversArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversArr[i] = arr[arr.length - 1 - i];

        }
        System.out.println("array in reverse order" + Arrays.toString(reversArr));

        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("a recurring number " + arr[i]);
            }

        }

    }
}