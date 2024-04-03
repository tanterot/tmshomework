import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ivan", 5, Arrays.asList("Task1", "Task2", "Task3")));
        users.add(new User("Mariya", 3, Arrays.asList("Task4", "Task5")));
        users.add(new User("Alex", 2, Arrays.asList("Task6", "Task7", "Task8", "Task9")));
        users.add(new User("Natalia", 4, Arrays.asList("Task10", "Task11")));
        users.add(new User("Petr", 1, Arrays.asList("Task12", "Task13", "Task14")));
        users.add(new User("Ivan", 5, Arrays.asList("Task1", "Task2", "Task3")));


        Methods methods = new Methods();
        List<User> task = methods.usersMore2Tasks(users);
        System.out.println(task);
        List<User> experience = methods.sortExperience(users);
        System.out.println(experience);
        Set<User> sort = methods.sortExperienceSet(users);
        System.out.println(sort);
        Set<User> uniqe = methods.uniqeNames(users);
        System.out.println(uniqe);
    }
}