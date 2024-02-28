public class User {
    private String userName;
    private int experience;
    private Profession profession;

    public User(String userName, int experience, Profession profession) {
        this.userName = userName;
        this.experience = experience;
        this.profession = profession;

    }

    public void printSalary() {
        System.out.println(profession+ "," +userName+": salary = " + this.salary());
    }

    public void printSalary(double dopoplata) {
        System.out.println(profession+ "," +userName+": salary + additional payment = " + this.salary(dopoplata));
    }

    private double salary() {
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

    private double salary(double dopOplata) {
        double salary = this.salary();
        if (dopOplata > 0) {
            salary += dopOplata;
            return salary;
        } else return this.salary();


    }

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