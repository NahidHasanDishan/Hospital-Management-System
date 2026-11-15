public class Main {
    public static void main(String[] args) {
        Patient p1 = new IndoorPatient(101, "Rahim", 35, 5000.0, 4);
        Patient p2 = new OutdoorPatient(102, "Karim", 28, 2500.0);
        Patient p3 = new EmergencyPatient(103, "Sumaiya", 40, 8000.0, 1500.0);

        System.out.println();
        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
        System.out.println();
        p3.displayInfo();

    }
}
