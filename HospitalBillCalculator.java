import java.util.*;

public class HospitalAppointment {
    public static int hospitalPatient(String name, String type, int test) {
        int consultationFee = 0;
        int testCharges = 0;
        int bill = 0;
        int discount = 0;
        int finalBill = 0;

        // Reject invalid test count
        if (test < 0) {
            System.out.println("Invalid number of tests!");
            return -1;
        }

        // Consultation type check
        switch (type.toLowerCase()) {
            case "general":
                consultationFee = 300;
                break;
            case "specialist":
                consultationFee = 700;
                break;
            case "emergency":
                consultationFee = 1500;
                break;
            default:
                System.out.println("Invalid consultation type!");
                return -1;
        }

        // Calculate charges
        testCharges = test * 200;
        bill = consultationFee + testCharges;

        // Apply discount
        if (bill >= 2000) {
            discount = (bill * 10) / 100;
        }

        finalBill = bill - discount;

        // Display details
        System.out.println("Patient Name: " + name);
        System.out.println("Consultation Type: " + type);
        System.out.println("Consultation Fee: ₹" + consultationFee);
        System.out.println("Test Charges: ₹" + testCharges);
        System.out.println("Total Bill (before discount): ₹" + bill);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Bill: ₹" + finalBill);

        return finalBill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Patient name: ");
        String name = sc.nextLine();

        System.out.print("Consultation type (general/specialist/emergency): ");
        String type = sc.nextLine();

        System.out.print("Number of tests: ");
        int test = sc.nextInt();

        hospitalPatient(name, type, test);
    }
}
