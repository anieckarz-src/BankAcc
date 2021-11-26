import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginSection loginSection = new LoginSection();
        BankAccount account = new BankAccount();

        boolean createdAccount = false;
        boolean exitProject = false;
        System.out.println("Welcome to my Project");

        while (!exitProject) {

            start();

            switch (scanner.nextInt()) {
                case 1 -> {
                    if (createdAccount) {
                        System.out.print("\ntype your pin: ");
                        if (loginSection.correctPin(scanner.next(), account.getCustomerPin())) {
                            boolean exit = false;
                            while (!exit) {

                                switch (loginSection.sayHello(account.getCustomerName(), account.getBalance(), account.getAccountNumber())) {
                                    case 1 -> {
                                        System.out.print("to withdraw: ");
                                        account.withdrawFunds(scanner.nextInt());
                                    }
                                    case 2 -> {
                                        System.out.print("to deposit: ");
                                        account.depositFunds(scanner.nextInt());
                                    }
                                    default -> exit = true;
                                }
                            }


                        } else {
                            System.out.println("Invalid Pin!");
                        }
                    } else
                        System.out.println("\nyou don't have bank account \n");
                }
                case 2 -> {

                    System.out.print("your name:");
                    account.setCustomerName(scanner.next());

                    System.out.print("your pin:");
                    account.setCustomerPin(scanner.next());

                    account.setAccountNumber(AccountNumberGenerator.generateAccountNumber());
                    createdAccount = true;
                    System.out.println("\n Account created");
                }
                default -> {
                    System.out.println("\nGoodbye!!");
                    exitProject = true;
                }


            }

        }

    }


    public static void start() {
        System.out.println("\n1. Login");
        System.out.println("2. Create new account");
        System.out.println("3. Exit");
        System.out.print("Choice: ");

    }
}
