import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> integerList2 = new ArrayList<>(List.of(5,4,3,2,1));

        boolean equalCollection = CollectionUtils.isEqualCollection(integerList, integerList2);
        System.out.println(equalCollection);
    }
}
