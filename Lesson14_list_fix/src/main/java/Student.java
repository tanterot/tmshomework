import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private boolean isMan;
    private int age;
    private List<String> classes;

    @Override
    public String toString() {
        String gender = (isMan) ? " is MAN" : " is WOMEN";
        return "NAME- " + name + " AGE- " + age + gender + " electives: " + classes;
    }
}

