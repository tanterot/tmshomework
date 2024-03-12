package ext;

public class Surgeon extends AbstractDoc {
    private String name;
    private Specialization specialization;

    public Surgeon(String name, Specialization specialization) {
        this.name = name;
        this.specialization = specialization;
    }
//переопределение метода
    @Override
    public void toHeal() {
        System.out.println("the surgeon performs the operation");
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "name='" + name + '\'' +
                ", specialization=" + specialization +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }
}
