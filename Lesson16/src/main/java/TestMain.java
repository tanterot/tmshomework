import java.util.Map;

public class TestMain {
    public static void main(String[] args) {
        String[] str = {"a","a","b","c","c"};
        String[] str1 = {"code", "bug"};
        Methods methods = new Methods();
        Map<String,Boolean> resultArr =   methods.returnArr(str);
        System.out.println(resultArr);
        Map<String,String> resultArr1 =  methods.firstEndChar(str1);
        System.out.println(resultArr1);


    }
}
