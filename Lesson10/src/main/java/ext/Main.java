package ext;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("John", 30, 5000);
        Person person2 = person1.clone();
        person2.setName("Bob");
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        boolean equals = person1.equals(person2);
        System.out.println(equals);
    }
}
