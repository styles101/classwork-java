/*
NAME: Allan Kibet
ADM: CT101/G/19975/23

TASKS:
Java code implementing A base class BAnkAccount, A subclass SavingsAccount,
and A subclass CheckingAccount.
This is a banking application showing how inheritance is implemented
*/
abstract class BankAccount {
    protected double balance;

    //constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    //Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    //Method to withdraw money
    public abstract boolean withdraw(double amount);

}

//A subclass SavingsAccount that inherits from BankAccount
class SavingsAccount extends BankAccount {
    //constructor
    public SavingsAccount (double balance) {
        super(balance);
    }

    //Withdraw method for SavingAccounts
    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $100 must be maintained.");
            return false;
        }
    }
}

//class representing CheckingAccount that inherits BankAccount
class CheckingAccount extends BankAccount {

    //constructor
    public CheckingAccount(double balance) {
        super(balance);
    }

    // Withdraw method implementing the rules for checking account
    @Override
    public boolean withdraw(double amount) {
        //withdraw fee
        double fee = 1;
        if (balance - (amount + fee) >= 0){
            balance -= (amount + fee);
            return true;
        } else {
            System.out.println("Withdrawal denied. Insufficient funds.");
            return false;
        }
    }
}

//Main class
public class Main {
    public static void main(String[] args) {
        // Create SavingsAccount object
        SavingsAccount savings = new SavingsAccount(500);

        // Deposit $200 into savings account
        savings.deposit(200);

        // Attempt to withdraw $150 from the savings account
        if (savings.withdraw(150)) {
            System.out.println("Withdrawal of $150 was successful.");
        }

        // Attempt to withdraw $400 from the savings account
        if (savings.withdraw(400)) {
            System.out.println("Withdrawal of $400 was successful.");
        }

        // Create CheckingAccount object with initial balance of $500
        CheckingAccount checking = new CheckingAccount(500);

        // Deposit $200 into the checking account
        checking.deposit(200);

        // Attempt to withdraw $150 from the checking account (with $1 fee)
        if (checking.withdraw(150)) {
            System.out.println("Withdrawal of $150 was successful.");
        }

        // Attempt to withdraw $400 from the checking account (with $1 fee)
        if (checking.withdraw(400)) {
            System.out.println("Withdrawal of $400 was successful.");
        }
    }
}
