//project 1-->ATM Management System
//# Problem Statement
//
//Create a Java class named `ATM` to simulate the basic functionality of an Automated Teller Machine (ATM).
//
//The `ATM` class should contain the following data members:
//
//* `balance` to store the account balance.
//* `pin` to store a predefined ATM PIN.
//
//Implement the following methods in the `ATM` class:
//
//1. **checkPin()**
//
//   * Prompt the user to enter the ATM PIN.
//   * Allow a maximum of three attempts to enter the correct PIN.
//   * If the entered PIN is correct, display the ATM menu.
//   * If all three attempts fail, display an appropriate message and terminate the program.
//
//2. **menu()**
//
//   * Display the following options:
//
//     * Check Balance
//     * Withdraw Money
//     * Deposit Money
//     * Exit
//   * Continue displaying the menu until the user chooses to exit.
//
//3. **checkBalance()**
//
//   * Display the current account balance.
//
//4. **depositMoney()**
//
//   * Accept the deposit amount from the user.
//   * Validate that the entered amount is greater than zero.
//   * Update the account balance and display a success message.
//
//5. **withdrawMoney()**
//
//   * Accept the withdrawal amount from the user.
//   * Validate that the amount is greater than zero.
//   * Ensure sufficient balance is available before processing the transaction.
//   * Display appropriate messages for successful or unsuccessful transactions.
//
//Finally, create another class named `ATM_machine` containing the `main()` method. Create an object of the `ATM` class and invoke the `checkPin()` method to start the application.
//
//**Requirements:**
//
//* Use object-oriented programming principles.
//* Use methods to perform each operation.
//* Use a menu-driven approach.
//* Validate all user inputs wherever necessary.
//* Display meaningful messages for every transaction and invalid operation.





import java.util.Scanner;

class ATM {

    private double balance = 0;
    private final int pin = 1234;
    private final Scanner sc = new Scanner(System.in);

    // Check PIN
    public void checkPin() {

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                System.out.println("\nLogin Successful!");
                menu();
                return;
            } else {
                attempts--;
                System.out.println("Invalid PIN.");

                if (attempts > 0) {
                    System.out.println("Attempts left: " + attempts);
                }
            }
        }

        System.out.println("\nAccount Locked! Too many incorrect attempts.");
    }

    // Menu
    public void menu() {

        while (true) {

            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    withdrawMoney();
                    break;

                case 3:
                    depositMoney();
                    break;

                case 4:
                    System.out.println("\nThank you for using our ATM.");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Withdraw Money
    public void withdrawMoney() {

        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }

    // Deposit Money
    public void depositMoney() {

        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
            System.out.println("Current Balance: ₹" + balance);
        }
    }
}

public class project1 {

    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.checkPin();
    }
}