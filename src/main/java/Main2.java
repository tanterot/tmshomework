import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца:");
        String season = scanner.next();
        scanner.close();
        switch (season) {
            case "декабрь","январь","февраль":
                System.out.println("сейчас Зима");
                break;
            case "март","апрель","май":
                System.out.println("сейчас Весна");
                break;
            case "июнь","июль","август":
                System.out.println("сейчас Лето");
                break;
            case "сентябрь","октябрь","ноябрь":
                System.out.println("сейчас Осень");
            default:
                System.out.println("Введено некоректное название месяца.");

        }


    }

}
