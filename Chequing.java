public class Chequing extends BankAccount {
    public Chequing(double balance) {
        super(balance);
    }

    public void writeACheck(double amount) {
        if (amount > 0) {
            balance -= amount;
            balance -= 1;

            if (balance < 0)
                balance = 0;
        }
    }

    @Override

    public void display() {
        System.out.printf("Type: Chequing, Balance: $%.2f%n", balance);
    }
}
