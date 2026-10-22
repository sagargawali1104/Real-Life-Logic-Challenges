import java.util.*;

public class ElectricityBillCalculator {
    public static int electricBill(int unit) {
        // Handle invalid input
        if (unit < 0) {
            return -1; // return -1 to indicate invalid units
        }

        int totalBill = 50; // fixed charge

        if (unit <= 100) {
            totalBill += unit * 5;
        } else if (unit <= 200) {
            totalBill += (100 * 5) + ((unit - 100) * 7);
        } else {
            totalBill += (100 * 5) + (100 * 7) + ((unit - 200) * 10);
        }

        return totalBill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Units consumed: ");
        int unit = sc.nextInt();

        int result = electricBill(unit);

        if (result == -1) {
            System.out.println("Invalid input: Units cannot be negative.");
        } else {
            System.out.println("Electricity Bill: ₹" + result);
        }

        sc.close();
    }
}
