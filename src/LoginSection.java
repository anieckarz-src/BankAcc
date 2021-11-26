import java.util.Scanner;

public class LoginSection {


    public boolean correctPin(String typedPin, String accountPin) {
        return typedPin.equals(accountPin);
    }

    Scanner scanner = new Scanner(System.in);
    public int sayHello(String name, int balance,String accountNumber) {
        System.out.println("\nHi " + name);
        System.out.println("Your balance:" + balance);
        System.out.println("Your account number:" + accountNumber);
        System.out.println("1. withdraw");
        System.out.println("2. deposit");
        System.out.println("3. exit");
        System.out.print("choice: ");

        return scanner.nextInt();
    }


}
