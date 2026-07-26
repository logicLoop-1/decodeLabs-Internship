package ATMInterface;

public class Main {
    static void main() {
        BankAccount account = new BankAccount("acc1011", "2323", 5000);
        ATM atm = new ATM(account);
        atm.start();
    }
}
