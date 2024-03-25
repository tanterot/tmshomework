package ext;

public class Worker extends Employee{
    public Worker(String name, String surname, int experience) {
        super(name, surname, experience, Post.WORKER);
    }

}
