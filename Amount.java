class Amount {
    private TransactionType transactionType;
    private double amount;
    public Amount(TransactionType transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
    }
    public TransactionType getTransactionType() {
        return transactionType;
    }
    public double getAmount() {
        return amount;
    }
    public String toString() {
        return "Transaction: " + transactionType + ", Amount: " + amount;
    }
}
