public class User {
    private String userName;
    private int experience;
    private Profession profession;

    //конструктор для создания объекта класса
    public User(String userName, int experience, Profession profession) {
        this.userName = userName;
        this.experience = experience;
        this.profession = profession;

    }

    //метод который выводит зарплату
    public void printSalary() {
        System.out.println(profession + "," + userName + ": salary = " + this.salary());
    }

    //переопределенный метод с допоплатой
    public void printSalary(double dopoplata) {
        System.out.println(profession + "," + userName + ": salary + additional payment = " + this.salary(dopoplata));
    }

    //считаем зарплату , используем свич для работы с енамом
    public double salary() {
        double coefficient = 0;
        switch (profession) {
            case HR:
                coefficient = 1.9;
                break;
            case WORKER:
                coefficient = 1.6;
                break;
            case DIRECTOR:
                coefficient = 2.5;

        }

        double salary = 1000 * coefficient * experience;
        return salary;

    }
//метод корорый считает ЗП+доплата , для уменьшения кода использовал this., так же добавил
// проверку доплаты если значение отрицательное , ЗП остаеться без изменений.

    private double salary(double dopOplata) {
        double salary = this.salary();
        if (dopOplata > 0) {
            salary += dopOplata;
            return salary;
        } else {
            return this.salary();
        }


    }

    // гетеры и сетеры , для поля name только гетер , так как меняеться стаж и должность , но не имя.
    public String getUserName() {
        return userName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}