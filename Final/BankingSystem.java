package Final;

class Account {

    private String ownerName;
    private double balance;

    Account(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    void deposit(double depAmount) {
        this.balance += depAmount;
        System.out.printf("Success! %.2f deposited. New Balance: %.2f \n", depAmount, this.balance);
    }

    void checkBalance() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Owner: " + this.ownerName);
        System.out.printf("Current Balance: %.2f\n", this.balance);
    }

    void withDraw(double withdrawAmount) {
        if (withdrawAmount > this.balance) {
            System.out.println(" Error: Insufficient Funds! You only have " + this.balance);
        } else {
            this.balance -= withdrawAmount;
            System.out.printf(" Success! Withdrawn %.2f. Remaining: %.2f\n", withdrawAmount, this.balance);
        }
    }

    public static void main(String[] args) {

        Account account1 = new Account("Mollik", 10000);

        account1.deposit(2000);
        account1.withDraw(8000);
        account1.withDraw(50000);

        account1.checkBalance();
    }
}