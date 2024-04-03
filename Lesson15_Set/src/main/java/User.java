import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User implements Comparable<User> {
    private String name;
    private int experience;
    private List<String> tasks;

    @Override
    public int compareTo(User o) {
        return this.experience - o.experience;
    }

    @Override
    public String toString() {
        return "User: " + name + "; Experience: " + experience + "; Task: " + tasks + "\n";
    }
}
