import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pat {
    public static void main(String[] args) {


        String template = "Hi %s you are %s years old today. Happy birthday!!! ";
        String name = "Marko Polo";
        int age = 30;

        String stringFormat = String.format(template, name, age);

        Pattern pattern = Pattern.compile("Hi ([A-Za-z ]+) you are (\\d+) years old today. Happy birthday!!!");
        Matcher matcher = pattern.matcher(stringFormat);
        if (matcher.find()) {
            System.out.println("The string corresponds to the pattern");
        } else {
            System.out.println("The string does not match the pattern");
        }
    }

}
