class BankAccount {
    static String bankName = "HDFC Bank";
    static int totalAccounts = 0;

    final String accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Bank: " + bankName);
        }
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Deepak", "HDFC123");
        acc1.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
