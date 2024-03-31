import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data @AllArgsConstructor
public class User {
        String name;
        int experience;
        List<String> tasks;


}
