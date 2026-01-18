package ATM;
import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        final int PIN = 1234;   // Correct PIN
        int balance = 5000;     // Initial balance
        int attempts = 0;       // Track wrong attempts
        boolean isAuthenticated = false;

        Scanner sc =  new Scanner(System.in);

        // PIN Verification with 3 attempt limit
        while (attempts < 3) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == PIN) {
                isAuthenticated = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
            }
        }

        if (!isAuthenticated) {
            System.out.println("Account Blocked! Too many incorrect attempts.");
            return; // Exit program
        }

        // If authenticated, show ATM menu
        int choice;
        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    int withdraw = sc.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful. New Balance: ₹" + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ₹");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Deposit Successful. New Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice. Try again.");
            }
        } while (choice != 4);


   sc.close();

    }
}
