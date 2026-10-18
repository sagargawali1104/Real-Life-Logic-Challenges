import java.util.*;

public class shoppingCart {
    public static int totalBill(int price, int quantity) {
        int total = price * quantity;
        int discount = 0;

        // check total price
        if (total >= 1000) {
            discount = (total * 10) / 100;  // 10% discount
        }

        int finalBill = total - discount;

        System.out.println("Total Bill: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);

        return finalBill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Product price: ");
        int price = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int bill = totalBill(price, quantity);
        System.out.println("Customer needs to pay: " + bill);
    }
}
