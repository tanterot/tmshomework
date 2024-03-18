package ext;

public abstract class Employee {
    private String name;
    private String surname;
    private int experience;
    private Post post;

    public Employee(String name, String surname, int experience, Post post) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.post = post;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + experience +
                ", post=" + post +
                '}';
    }
}
