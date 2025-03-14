public class BankAccount {
    // Private variable to store the account balance
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Public method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Main method to demonstrate the usage of BankAccount class
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        // Display initial balance
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempt to withdraw more than the balance
        account.withdraw(2000.0);
        System.out.println("Balance after attempted withdrawal: " + account.getBalance());
    }
}