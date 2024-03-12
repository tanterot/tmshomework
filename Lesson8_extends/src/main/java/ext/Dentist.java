package ext;

public class Dentist extends AbstractDoc {
    private String name;
    private Specialization specialization;

    public Dentist(String name, Specialization specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public void toHeal() {
        System.out.println("dentist pulls out teeth");
    }

    @Override
    public String toString() {
        return "Dentist{" +
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
