
package ext;

import lombok.*;

import java.util.Objects;
@Getter
@Setter
@ToString
public class Person implements Cloneable {
    private String name;
    private int age;
    private double salary;
    private Cat cat;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat= new Cat("Bars");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(salary, person.salary) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode()+ age*31+ (int)salary*31;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }
}

