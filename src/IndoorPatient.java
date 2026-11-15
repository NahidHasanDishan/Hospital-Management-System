public class IndoorPatient extends Patient implements Insurance {

    public int numberOfDays;

    IndoorPatient(int patientId, String patientName, int age, double treatmentCost, int numberOfDays) {
        super(patientId, patientName, age, treatmentCost);
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        double TotalBill = getTreatmentCost() + (numberOfDays * 2000);
        return TotalBill;
    }
    public double calculateInsurance() {
        return calculateBill() * 0.30;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Age: "+getAge());
        System.out.println("Patient Type : Indoor " );
        System.out.println("Treatment Cost : " + getTreatmentCost());
        System.out.println("Total Bill : " + calculateBill());
        System.out.println("Days: "+numberOfDays);
        System.out.println("Insurance Coverage: "+calculateInsurance());
    }
}
