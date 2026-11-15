public class OutdoorPatient extends Patient {
    OutdoorPatient(int patientId, String patientName, int age, double treatmentCost) {
        super(patientId, patientName, age, treatmentCost);
    }

    @Override
    public double calculateBill() {
        double TotalBill = getTreatmentCost();
        return TotalBill;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Age: "+getAge());
        System.out.println("Patient Type : Outdoor " );
        System.out.println("Treatment Cost : "+calculateBill());
        System.out.println("Total Bill : "+calculateBill());
    }
}


