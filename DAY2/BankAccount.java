//encapsulation :- basically hides the details we don't wanna show or use outside the class
public class BankAccount {
    
    private int accountNumber;
    private double balance;

    public void SetAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void SetBalance(double balance) {
        this.balance = balance;
    }

    public int GetAccountNumber() {
        return accountNumber;
    }

    public double GetBalance() {
        return balance;
    }

    public static void  main(String[] args) {
        BankAccount b = new BankAccount();
        b.SetAccountNumber(404040);
        b.SetBalance(90909);
        System.out.println("Account number: " + b.GetAccountNumber());
        System.out.println("Account balance: " + b.GetBalance());
    }
}