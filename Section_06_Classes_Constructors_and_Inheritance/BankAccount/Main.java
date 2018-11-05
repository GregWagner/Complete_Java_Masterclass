public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1234, 1000, "Greg Wagner",
                "gwagner@gmail.com", "555-777-8888");
        System.out.printf("set Balance to 1000   Balance: $%.2f%n", 
                account.getBalance());
        account.deposit(-100);
        System.out.printf("deposit -100          Balance: $%.2f%n",
                account.getBalance());
        account.deposit(100);
        System.out.printf("deposit 100           Balance: $%.2f%n",
                account.getBalance());
        account.withdraw(100);
        System.out.printf("withdraw 100          Balance: $%.2f%n",
                account.getBalance());
        account.withdraw(2000);
        System.out.printf("withdraw 2000         Balance: $%.2f%n",
                account.getBalance());

        VipCustomer firstCustomer = new VipCustomer();
        System.out.printf("%n1st Customer%nName: %s\nCredit Limit: %.2f%nEmail: %s%n",
                firstCustomer.getName(), firstCustomer.getCreditLimit(),
                firstCustomer.getEmail());
        VipCustomer secondCustomer = new VipCustomer("Greg Wagner", "greg@gmail.com");
        System.out.printf("%n2nd Customer%nName: %s\nCredit Limit: %.2f%nEmail: %s%n",
                secondCustomer.getName(), secondCustomer.getCreditLimit(),
                secondCustomer.getEmail());
        VipCustomer thirdCustomer = new VipCustomer("Greg Wagner", 10_000.0,
                "greg@gmail.com");
        System.out.printf("%n3rd Customer%nName: %s\nCredit Limit: %.2f%nEmail: %s%n",
                thirdCustomer.getName(), thirdCustomer.getCreditLimit(),
                thirdCustomer.getEmail());
    }
}
