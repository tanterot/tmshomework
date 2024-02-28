import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            if (i % 2 == 1 && i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
