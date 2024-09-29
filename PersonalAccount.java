import java.util.ArrayList;
import java.util.List;
class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private List<Amount> transactions;
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(TransactionType.DEPOSIT, amount));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Amount(TransactionType.WITHDRAWAL, amount));
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void printTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions to display.");
        } else {
            for (Amount transaction : transactions) {
                System.out.println(transaction.toString());
            }
        }
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
}