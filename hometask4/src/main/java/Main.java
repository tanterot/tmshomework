public class Main {
    public static void main(String[] args) {
        Cat user = new Cat("murka",5,"shotland");
        Cat user2 = new Cat("Viski",4);

        user.printInfo();
        user2.printInfo();

        user.newName("Lorik");
        user.printInfo();



    }
}
