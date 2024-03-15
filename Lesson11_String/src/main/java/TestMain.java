import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
    public static void main(String[] args) {
        String test = "Hello world. I'm Andrei. Nice to mit you.";
        System.out.println(test.length());                          //длинна сторки
        String[] split = test.split("/.");                   //разбил строку медод split, разделитель --> . <--;
        System.out.println(Arrays.toString(split));               //вывод массива элементов
        System.out.println(Arrays.toString(split).length());     //вывод ее длинны
        System.out.println(test.substring(5));        //подстрока с позиции 5, метод substring
        System.out.println(new StringBuilder(test).reverse()); //зеркальная строка в StringBuilder метод revers
        //-----------
        String template = "Hi %s you are %s years old today. Happy birthday!!! ";
        String name = "Marko Polo";
        int age = 30;
        String newFormat = String.format(template, name, age);
        System.out.println(newFormat);
        Pattern pattern = Pattern.compile("([A-Za-z]+)\\s([A-Za-z]+)");
        Matcher matcher = pattern.matcher(newFormat);
        if (matcher.find()) {
            System.out.println("Строка соответствует паттерну");
        } else {
            System.out.println("Строка не соответствует паттерну");
        }
    }
}
