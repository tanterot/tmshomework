package clinic;

import ext.Dentist;
import ext.Specialization;
import ext.Surgeon;
import ext.Therapist;

public class Clinic {
    public static void main(String[] args) {
        Therapist therapist =new Therapist("Viktoria", Specialization.THERAPIST);
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);
        therapist.assignDoctor(patient1);
        patient1.executeTreatment();
        therapist.assignDoctor(patient2);
        patient2.executeTreatment();
        therapist.assignDoctor(patient3);
        patient3.executeTreatment();
    }
    //решил побалываться и добавил отсебятины в задачу
}
