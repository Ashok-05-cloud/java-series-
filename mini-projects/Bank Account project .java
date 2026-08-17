class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {

        if (balance >= amount) {

            System.out.println(
                Thread.currentThread().getName()
                + " is withdrawing ₹" + amount
            );

            balance -= amount;

            System.out.println(
                "Remaining balance: ₹" + balance
            );

        } else {

            System.out.println(
                Thread.currentThread().getName()
                + " - Insufficient balance"
            );
        }
    }

    public int getBalance() {
        return balance;
    }
}