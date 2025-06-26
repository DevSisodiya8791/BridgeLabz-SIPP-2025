class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Deepak";
        acc.accountNumber = "SBIN0001234";
        acc.balance = 10000;
        acc.deposit(5000);
        acc.withdraw(2000);
        acc.displayBalance();
    }
}
