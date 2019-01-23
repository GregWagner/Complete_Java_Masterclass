public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(0, 0.0, "Unknown", "Unknown", "Unknown");
    }

    public BankAccount(int accountNumber, double balance, String name,
            String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.printf("Amount must be positive (%.2f)%n", amount);
        } else {
            setBalance(getBalance() + amount);
            System.out.printf("Deposit of %.2f processed. New balance: %.2f.%n",
                    amount, getBalance());
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.printf("Amount must be positive (%.2f)%n", amount);
        } else if (amount > getBalance()) {
            System.out.printf("Only %.2f available. Withdrawal not processed.%n",
                    getBalance());
        } else {
            setBalance(getBalance() - amount);
            System.out.printf("Withdrawal of %.2f processed. " + 
                    "Remaining balance: %.2f.%n", amount, getBalance());
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
