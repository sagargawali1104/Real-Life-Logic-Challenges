import java.util.*;

public class ATMCash {
    public static int withdrawAmount(int amount, int withdraw) {
        if (withdraw <= amount) {
            amount = amount - withdraw;
        } else {
            System.out.println("Invalid withdraw amount!");
        }
        return amount;
    }

    public static int depositAmount(int amount, int deposit) {
        amount = amount + deposit;   // always add deposit
        return amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        int acc = sc.nextInt();

        System.out.print("Enter withdraw amount: ");
        int wit = sc.nextInt();

        System.out.print("Enter deposit amount: ");
        int dep = sc.nextInt();

        // Withdraw first
        acc = withdrawAmount(acc, wit);
        System.out.println("After withdraw, balance is: " + acc);

        // Deposit next (using updated balance)
        acc = depositAmount(acc, dep);
        System.out.println("After deposit, balance is: " + acc);
    }
}
