import java.util.*;

public class Main {
    public static void main(String[] args) {
        bankAccount userAccount = new bankAccount(1000);

        ATM atm = new ATM(userAccount);

        Scanner sc = new Scanner(System.in);

        atm.checkBalance();

        System.out.println("Enter amount to deposite");
        double depositeAmount = sc.nextDouble();
        atm.deposite(depositeAmount);

        System.out.println("Enter amount to withdraw");
        double withdrawAmount = sc.nextDouble();
        atm.withdraw(withdrawAmount);

        atm.checkBalance();
    }
}
