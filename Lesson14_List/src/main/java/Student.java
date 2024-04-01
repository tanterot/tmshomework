import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private boolean isMan;
    private int age;
    private List<String> classes;

    @Override
    public String toString() {
        if (isMan){
            return "NAME- "+name+" AGE- "+age+" is MAN, electives: "+classes;
        }else {
            return "NAME- "+name+" AGE- "+age+" is WOMAN, electives: "+classes;
        }
    }
}