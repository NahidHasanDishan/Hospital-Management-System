public abstract class Patient {

    private int patientId;
    private String patientName;
    private int age;
    private double treatmentCost;

    public Patient(int patientId, String patientName, int age, double treatmentCost) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.treatmentCost = treatmentCost;
    }
    public int getPatientId() {
        return patientId;
    }
    public String getPatientName() {
        return patientName;
    }
    public int getAge() {
        return age;
    }
    public double getTreatmentCost() {
        return treatmentCost;
    }

    void displayInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
    }
    public abstract double calculateBill();



}