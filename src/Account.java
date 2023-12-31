
import java.text.NumberFormat;

public class Account {

    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    private final double RATE = 0.035; // interest rate of 3.5%
    private int acctNumber;
    private double balance;
    private String name;
//-----------------------------------------------------------------
// Sets up the account by defining its owner, account number,
// and initial balance.
//-----------------------------------------------------------------

    public Account(String owner, int account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    
    public Account(String owner)
    {
    name = owner;
    acctNumber = (int)(Math.random()*((99999 - 10000)+1) +10000);
    balance = 0.0;
        System.out.println("");
        System.out.println("Account created:");
        System.out.println("Name: "+ name);
        System.out.println("Account Number: " + acctNumber);
        System.out.println("Balance: " + fmt.format(balance));
        
    }
//-----------------------------------------------------------------
// Validates the transaction, then deposits the specified amount
// into the account. Returns the new balance.
//-----------------------------------------------------------------

    public double deposit(double amount) {
        if (amount < 0) // deposit value is negative
        {
            System.out.println();
            System.out.println("Error: Deposit amount is invalid.");
            System.out.println(acctNumber + " " + fmt.format(amount));
        } else {
            balance = balance + amount;
        }
        return balance;
    }
//-----------------------------------------------------------------
// Validates the transaction, then withdraws the specified amount
// from the account. Returns the new balance.
//-----------------------------------------------------------------

    public double withdraw(double amount, double fee) {
        amount += fee;
        if (amount < 0) // withdraw value is negative
        {
            System.out.println();
            System.out.println("Error: Withdraw amount is invalid.");
            System.out.println("Account: " + acctNumber);
            System.out.println("Requested: " + fmt.format(amount));
        } else if (amount > balance) // withdraw value exceeds balance
        {
            System.out.println();
            System.out.println("Error: Insufficient funds.");
            System.out.println("Account: " + acctNumber);
            System.out.println("Requested: " + fmt.format(amount));
            System.out.println("Available: " + fmt.format(balance));
        } else {
            balance = balance - amount;
        }
        return balance;
    }

    public void transfer(Account acct, double amount, double fee) {
        if (amount < 0)
        {
            System.out.println();
            System.out.println("Transfer amount is invalid");
        } else if (balance < amount)
        {
            System.out.println();
            System.out.println("Error: Insufficient Funds.");
        } else {
            double remBalance = withdraw(amount, fee);
            double updatedBalance = acct.deposit(amount - fee);
           
            System.out.println();
            System.out.println("Updated balance--");
            System.out.println("Account: " + acctNumber + ", Updated balance: " + remBalance);
            System.out.println("Account: " + acct.acctNumber + ", Updated balance: " + updatedBalance);
        }
    }

//-----------------------------------------------------------------
// Adds interest to the account and returns the new balance.
//-----------------------------------------------------------------
    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }
//-----------------------------------------------------------------
// Returns the current balance of the account.
//-----------------------------------------------------------------

    public double getBalance() {
        return balance;
    }
//-----------------------------------------------------------------
// Returns the account number.
//-----------------------------------------------------------------

    public int getAccountNumber() {
        return acctNumber;
    }
//-----------------------------------------------------------------
// Returns a one-line description of the account as a string.
//-----------------------------------------------------------------

    public String toString() {
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}
