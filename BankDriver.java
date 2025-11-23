public class BankDriver {
    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[100];

        accounts[0] = new Savings(1100, .05);
        accounts[0].deposit(100);
        accounts[0].withdraw(200);
        ((Savings) accounts[0]).addInterest();

        accounts[1] = new Chequing(-100);
        accounts[1].deposit(50);

        accounts[2] = new Chequing(200);
        accounts[2].withdraw(210);
        accounts[2].deposit(100);
        ((Chequing) accounts[2]).writeACheck(50);

        for (int i = 0; i < accounts.length && accounts[i] != null; i++) {
            accounts[i].display();
        }
    }

}
