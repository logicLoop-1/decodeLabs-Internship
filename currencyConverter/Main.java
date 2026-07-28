package currencyConverter;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        int choice;
        do{
            System.out.println("1. convert 2. exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    String[] supportedCurrencies = {"USD", "PAK", "IND", "EUR", "GBP"};
                    System.out.println("conversion: ");
                    System.out.println("enter the source currency(e.g PAK): ");
                    String from = sc.next();
                    while(!isValidCurrency(from, supportedCurrencies)){
                        System.out.println("unsupported currency try again later. ");
                        from = sc.next();
                    }
                    System.out.println("enter the target currency(e.g IND): ");
                    String to= sc.next();
                    while(!isValidCurrency(to, supportedCurrencies)){
                        System.out.println("unsupported currency try again later. ");
                        to = sc.next();
                    }
                    double amount = 0;
                    boolean validInput = false;
                    while(!validInput){
                        try{
                            System.out.println("enter amount: ");
                            amount = sc.nextDouble();
                            if(amount<0){
                                System.out.println("amount cannot be less than zero. try again");
                                continue;
                            }
                            validInput = true;
                        }
                        catch (InputMismatchException e){
                            System.out.println("please enter valid number");
                            sc.nextLine();
                        }
                    }
                    BigDecimal amountBD = new BigDecimal(Double.toString(amount));
                    BigDecimal result = converter.convert(from, to, amountBD);
                    System.out.println("Result: " + result);
                    System.out.println("got it "+ amount + " "+ from + " -> "+ to);
                    break;
                case 2:
                    System.out.println("goodbye");
                    break;
                default:
                    System.out.println("invalid opt try again later");
                    break;
            }
        }
        while (choice !=2);
        sc.close();
    }
    public static boolean isValidCurrency(String code, String[] supported){
        for (String c: supported){
            if(c.equalsIgnoreCase(code))
                return true;
        }
        return false;
    }
}

