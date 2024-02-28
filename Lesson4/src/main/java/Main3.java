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
        //сортирую элементы массива , что бы проверять рядом стоящие элементы.
        Arrays.sort(arr);

        int maxCount = 0;
        int maxRepetition = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            //&& использую для предотвращения выхода за границы массива,
            // так как если i<arr.length-1, нет сысло проверять второе условие.
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++; //добавляю щетчик i вне цикла for
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxRepetition = arr[i];
            }
        }
        //теперь сюда можно всунуть Integer.MAX_VALUE
        System.out.println(Arrays.toString(arr));
        System.out.println(maxRepetition);
    }
}