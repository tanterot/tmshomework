package testPacket;

import ext.*;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ivan", "Kirillov", 5);
        Worker worker2 = new Worker("Andrei", "Petrov", 3);
        Worker worker3 = new Worker("Igor", "Andreevich", 4);
        Worker worker4 = new Worker("Sergei","Andreevich",10);
        Director director1 = new Director("Alex", "Petrov", 10, 10);

//        System.out.println(worker1);
//        System.out.println(worker2);
//        System.out.println(worker3);
//        System.out.println(director1);

        director1.add(worker1);
        director1.add(worker2);

        Director director2 = new Director("Dmitriy", "Dmitrievich", 8, 10);
        director2.add(worker3);
        director2.add(worker4);

        director1.add(director2);

//        System.out.println(director1.hasSubordinate("Sergei Andreevich"));
        // вывод-- the employee works for Dmitriy Dmitrievich
        //true
//        director1.printDetails(); //метод выводит всех сотрудников , и через рекурсию если в подчинении деректора их сотрудников
        System.out.println(director1);
    }

}
