import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        String test = "Hello world. I'm Andrei. Nice to mit you.";
        System.out.println(test.length());                          //длинна сторки
        String[] split = test.split("/.");                   //разбил строку медод split, разделитель --> . <--;
        System.out.println(Arrays.toString(split));               //вывод массива элементов
        System.out.println(Arrays.toString(split).length());     //вывод ее длинны
        System.out.println(test.substring(5));        //подстрока с позиции 5, метод substring
        System.out.println(new StringBuilder(test).reverse()); //зеркальная строка в StringBuilder метод revers

    }
}
