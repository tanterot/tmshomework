import java.awt.desktop.UserSessionEvent;
import java.util.*;

public class Methods {
    public List<User> usersMore2Tasks(List<User> user) {
        List<User> userMore2Tasks = new ArrayList<>();
        if (user != null) {
            for (User users : user) {
                if (users != null && users.getTasks() != null && users.getTasks().size() > 2) {
                    userMore2Tasks.add(users);
                }
            }
        }
        return userMore2Tasks;
    }

    public List<User> sortExperience(List<User> user) {
        if (user != null) {
            Collections.sort(user);
        }
        return user;
    }

    //сортировка для уникальных пользователей
    public Set<User> sortExperienceSet(List<User> user) {
        Set<User> sort = new TreeSet<>();
        if (user != null) {
            sort.addAll(user);
        }

        return sort;
    }

    public Set<User> uniqeNames(List<User> user) {
        Set<User> uniqe = new HashSet<>();
        if (user != null) {
            uniqe.addAll(user);
        }
        return uniqe;
    }
}