public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private Amount[] transactions;
    private int count;
    public PersonalAccount(int accountNumber, String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new Amount[100];
        this.count = 0;
    }
    public void refrez(Amount amount){
        if(count<transactions.length){
            transactions[count++]=amount;
        }
        else {
            System.out.println("wrongggg");
        }
    }
    public void deposit(double amount){
        if (amount>0) {
            balance += amount;
            refrez(new Amount(amount, TransationType.DEPOSIT));
        }
        else{
            System.out.println("wrong");
        }

    }
    public void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance -= amount;
            refrez(new Amount(amount, TransactionType.WITHDRAWAL));
        }
        else{
            System.out.println("wrongg");
        }
    }
    public void printTransactionHistory(){
        if(count == 0){
            System.out.println("wronggg");
            return;
        }
        System.out.println("history: " + accountNumber);
        for(int i = 0; i<count; i++){
            System.out.println(transactions[i]);
        }
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public Amount[] getTransactions() {
        return transactions;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
