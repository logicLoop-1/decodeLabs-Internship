package ATMInterface;

public class BankAccount {
    private String accountNumber;
    private String pin;
    private double balance;

    public BankAccount(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public boolean validatePin(String enteredPin){
        return this.pin.equals(enteredPin);
    }
    public boolean deposit(double amount){
        if(amount<=0){
            return false;
        }
        balance +=amount;
        return true;
    }
    public boolean withdraw(double amount){
        if(amount<=0){
            return false;
        }
        if(amount>balance){
            return false;
        }
        balance -= amount;
        return true;
    }
}
