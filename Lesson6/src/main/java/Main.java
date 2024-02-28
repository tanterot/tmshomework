public class Main {
    public static void main(String[] args) {
        User user1 = new User("Andrei", 5, Profession.DIRECTOR);
        User user2 = new User("Petia", 10, Profession.WORKER);
        User user3 = new User("Kolia", 7, Profession.HR);

        user1.printSalary(1000);
        user1.printSalary();
        user2.printSalary();
        user3.printSalary();
        user3.printSalary(-100);


    }
}
