import java.util.*;

public class Methods {
    public Map<String, Boolean> returnArr(String[] arr) {
        Map<String, Boolean> mapArr = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (mapArr.containsKey(arr[i])) {
                    mapArr.put(arr[i], true);
                } else {
                    mapArr.put(arr[i], false);
                }
            }

        }
        return mapArr;
    }

    public Map<String, String> firstEndChar(String[] arr) {
        Map<String, String> feChar = new HashMap<>();
        for (String str : arr) {
            feChar.put(str.substring(0, 1), str.substring(str.length() - 1));
        }
        return feChar;

    }
}

