public class Savings extends BankAccount {
    private double intRate;

    public Savings(double balance, double intRate) {
        super(balance);
        this.intRate = intRate;    
    }

    public void addInterest() {
        double interest = balance * intRate;
        balance += interest;
    }

    @Override
    public void display() {
        System.out.printf("Savings Account Balance: $%.2f%n", balance);
    }
}
