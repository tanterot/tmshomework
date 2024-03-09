package clinic;

import ext.AbstractDoc;

public class Patient {
    private int treatmentPlan;
    private AbstractDoc assignedDoctor;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setAssignedDoctor(AbstractDoc doctor) {
        this.assignedDoctor = doctor;
    }

    public void executeTreatment() {
        assignedDoctor.toHeal();

    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}