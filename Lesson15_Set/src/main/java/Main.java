import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ivan", 5, Arrays.asList("Task1", "Task2", "Task3")));
        users.add(new User("Mariya", 3, Arrays.asList("Task4", "Task5")));
        users.add(new User("Alex", 2, Arrays.asList("Task6", "Task7", "Task8", "Task9")));
        users.add(new User("Natalia", 4, Arrays.asList("Task10", "Task11")));
        users.add(new User("Petr", 1, Arrays.asList("Task12", "Task13", "Task14")));

        System.out.println("Users who have more than 2 tasks:");
        for (User user : users) {
            if (user.tasks.size() > 2) {
                System.out.println(user);
            }
        }

        System.out.println("Users by work experience (from more to less):");
        users.sort((u1, u2) -> Integer.compare(u2.experience, u1.experience));
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("Unique user names:");
        Set<String> uniqueNames = new HashSet<>();
        for (User user : users) {
            uniqueNames.add(user.name);
        }
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}