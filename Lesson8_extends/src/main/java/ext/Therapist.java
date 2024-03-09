package ext;

import clinic.Patient;

public class Therapist extends AbstractDoc {

    private String name;
    private Specialization specialization;
    ;

    public Therapist(String name, Specialization specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public void toHeal() {
        System.out.println("the therapist treats");

    }
//метод назначения лечения + реализация toSting
    public void assignDoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            System.out.println("Hell I am ");
            Surgeon surgeon = new Surgeon("Alex", Specialization.SURGEON);
            System.out.println(surgeon);
            patient.setAssignedDoctor(surgeon);
        } else if (patient.getTreatmentPlan() == 2) {
            System.out.println("Hell I am ");
            Dentist dentist = new Dentist("Igor", Specialization.DENTIST);
            System.out.println(dentist);
            patient.setAssignedDoctor(dentist);
        } else {
            System.out.println("Hell I am ");
            System.out.println(this);
            patient.setAssignedDoctor(this);
        }
    }

    @Override
    public String toString() {
        return "Therapist{" +
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
