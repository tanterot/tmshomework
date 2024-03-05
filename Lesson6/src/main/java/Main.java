public class Main {
    public static void main(String[] args) {
        User user1 = new User("Andrei", 5, Profession.DIRECTOR);
        User user2 = new User("Petia", 10, Profession.WORKER);
        User user3 = new User("Kolia", 7, Profession.HR);
//проверка кода
        user1.printSalary(1000); //13,500
        user1.printSalary();              //12,500
        user2.printSalary();              //16,000
        user3.printSalary();              //13,300
//если вводим отрицательное значение сумма не меняеться
        user3.printSalary(-100); //13,300


    }
}
