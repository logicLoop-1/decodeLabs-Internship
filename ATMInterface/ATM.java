package ATMInterface;
import java.util.Scanner;
public class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }
    public void start(){
        if(!authenticate()){
            System.out.println("too many incorrect attempts card returned. ");
            return;
        }
        boolean running = true;
        while (running){
            printMenu();
            int choice = readMenuChoice();
            switch (choice){
                case 1 -> checkBalance();
                case 2 -> handleDeposit();
                case 3 ->handleWithdraw();
                case 4 -> {
                    System.out.println("thank you for using atm. bye" );
                    running = false;
                }
                default -> System.out.println("invalid option pls enter from 1-4: ");
            }
        }
    }
    private boolean authenticate(){
        int attempts = 0;
        while(attempts<3){
            System.out.println("enter your PIN: ");
            String enteredPin = sc.next();
            if(account.validatePin(enteredPin)){
                System.out.println("pin accepted. welcome!");
                return true;
            }
            attempts++;
            System.out.println("incorrect PIN. pls try again!");
        }
        return false;
    }
    public void printMenu(){
        System.out.println("---ATM---");
        System.out.println("1.check balance");
        System.out.println("2.deposit");
        System.out.println("3.Withdraw");
        System.out.println("4. exit");
        System.out.println("Choose an opt: ");
    }
    private int readMenuChoice(){
        while (!sc.hasNextInt()){
            System.out.println("not a valid number. pls enter numbers: ");
            sc.next();
        }
        return sc.nextInt();
    }
    private double readAmount(){
        System.out.println("enter amount: ");
        while (!sc.hasNextDouble()){
            System.out.println("this is not a valid amount. pls enter correct number: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    private void checkBalance(){
        System.out.println("your current balance is: "+ account.getBalance());
    }
    private void handleDeposit(){
        double amount = readAmount();
        if(account.deposit(amount)){
            System.out.println("deposit successful. new balance is: "+ account.getBalance());
        }
        else{
            System.out.println("deposit failed. Amount must be greater than 0");
        }
    }
    private void handleWithdraw(){
        double amount = readAmount();
        if(account.withdraw(amount)){
            System.out.println("withdrawal successful. new balance: "+ account.getBalance());
        } else if (amount<=0) {
            System.out.println("withdrawal failed. amount must be greater then 0. ");
        }
        else {
            System.out.println("withdrawal failed. insufficent money in acc. ");
        }
    }
}
