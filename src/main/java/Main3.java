import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц с 1 по 12");
        int seasonNumber = scanner.nextInt();
        scanner.close();
        if (seasonNumber == 12 || seasonNumber == 1 || seasonNumber == 2) {
            System.out.println("Пора года Зима");
        } else if (seasonNumber == 3 || seasonNumber == 4 || seasonNumber == 5) {
            System.out.println("Пора года Весна");
        }else if (seasonNumber==6||seasonNumber==7||seasonNumber==8){
            System.out.println("Пора года Лето");
        }else if (seasonNumber==9||seasonNumber==10||seasonNumber==11){
            System.out.println("Пора года Осень");
        }else System.out.println("Вы ввели некоректное значение");
    }
}
