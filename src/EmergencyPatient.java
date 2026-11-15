public class EmergencyPatient extends Patient implements Insurance{

    public double ambulanceCharge;
    EmergencyPatient(int patientId, String patientName, int age, double treatmentCost, double ambulanceCharge) {
        super(patientId, patientName, age, treatmentCost);
        this.ambulanceCharge = ambulanceCharge;
    }

    @Override
    public double calculateBill() {
        double TotalBill = getTreatmentCost() + ambulanceCharge + (getTreatmentCost() * 0.15) ;
        return TotalBill;
    }
    public double calculateInsurance() {
        return calculateBill() * 0.20;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Age: "+getAge());
        System.out.println("Patient Type : Emergency " );
        System.out.println("Treatment Cost : " + getTreatmentCost());
        System.out.println("Total Bill : " + calculateBill());
        System.out.println("Ambulance Charge: "+ambulanceCharge);
        System.out.println("Insurance Coverage: "+calculateInsurance());
    }

}


