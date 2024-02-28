import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число до 10.000");
        int value = scanner.nextInt();
        scanner.close();
        if (value < 10000) {
            int thousands = (value / 1000) % 10;
            int hundreds = (value / 100) % 10;
            int dozens = (value / 10) % 10;
            int units = value % 10;

            if (thousands > 0) {
                System.out.print(thousands + " тысяч, ");
            }
            if (hundreds > 0) {
                System.out.print(hundreds + " сотен, ");
            }
            if (dozens > 0) {
                System.out.print(dozens + " десятков, ");
            }
            if (units > 0) {
                System.out.print(units + " едениц, ");
            }
            System.out.print(" всего " + String.valueOf(value).length() + " знака.");
        } else System.out.println("Вы ввели некоректное значение");


    }
}