class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void showDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "123456789";
        sa.accountHolder = "Ritika";
        sa.deposit(5000);
        sa.showDetails();
        System.out.println("Balance: ₹" + sa.getBalance());
    }
}
