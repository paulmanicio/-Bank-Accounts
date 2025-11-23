public abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        if (balance < 0) balance = 0;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }    
    }
    public void withdraw(double amount) {
        if (amount < 0) return;
        balance -= amount;
        if (balance < 0) balance = 0;
    }
    public abstract void display();
}
