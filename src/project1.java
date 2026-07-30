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

/*
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


 */











//project 2-->oops + exception handling
//Problem Statement
//
//Create a Bank Account Management System in Java.
//
//The program should:
//
//Create a bank account with an account holder's name and initial balance.
//Allow users to:
//Deposit money
//Withdraw money
//Check balance
//If the withdrawal amount is greater than the available balance, throw a custom exception named InsufficientBalanceException.
//If the user enters a negative amount for deposit or withdrawal, throw an IllegalArgumentException.
//Handle all exceptions using try-catch.
//Display a message from the finally block after every transaction.
//Use encapsulation by keeping account details private.
//Demonstrate inheritance by creating a SavingsAccount class that extends BankAccount.
//Demonstrate method overriding by overriding the displayAccountType() method.
import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Parent Class
class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount <= 0)
            throw new IllegalArgumentException("Deposit amount must be positive.");

        balance += amount;
        System.out.println("Deposited : " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount <= 0)
            throw new IllegalArgumentException("Withdrawal amount must be positive.");

        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance.");

        balance -= amount;
        System.out.println("Withdrawn : " + amount);
    }

    public void showBalance() {
        System.out.println("Current Balance : " + balance);
    }

    public void displayAccountType() {
        System.out.println("Normal Bank Account");
    }
}

// Child Class
class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}

// Main Class
public class project1 {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount("Rishabh", 10000);

        Scanner sc = new Scanner(System.in);

        account.displayAccountType();

        try {

            System.out.print("Enter amount to deposit: ");
            double deposit = sc.nextDouble();
            account.deposit(deposit);

            System.out.print("Enter amount to withdraw: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);

            account.showBalance();

        }

        catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception : " + e.getMessage());
        }

        catch (IllegalArgumentException e) {
            System.out.println("Invalid Input : " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Unexpected Error : " + e.getMessage());
        }

        finally {
            System.out.println("Transaction Finished.");
        }

        sc.close();
    }
}