public class bankAccount {

    private double balance;

    public bankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite successful, your Balance is " + balance);
        } else {
            System.out.println("Deposite amount must be greater than Zero");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawl successful, you balance is " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawl");
        } else {
            System.out.println("Withdrawl amount must be greater than Zero");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class ATM {
    private bankAccount account;

    public ATM(bankAccount account) {
        this.account = account;
    }

    public void deposite(double amount) {
        account.deposite(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void checkBalance() {
        double balance = account.checkBalance();
        System.out.println("your current balance is " + balance);
    }

}
