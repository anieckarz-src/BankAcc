public class Main {

    public static void main(String[] args) {
        BankAccount adriansAccount = new BankAccount("231321312", 4000, "Adrian", "dsadas@gmail.com", "312312123");
        BankAccount barteksAccount = new BankAccount();
        BankAccount mareksAccount = new BankAccount("Marek", "marek@gmail.com", "55533333111");

        //  System.out.println("balance: " + adriansAccount.getBalance());
        //   adriansAccount.withdrawFunds(1000);
        // adriansAccount.depositFunds(1000000);

        System.out.println("\n" + barteksAccount.getAccountNumber());
        System.out.println(barteksAccount.getBalance());
        System.out.println(barteksAccount.getEmail());
        System.out.println(barteksAccount.getCustomerName());
        System.out.println(barteksAccount.getPhoneNumber());

        System.out.println("\n" + barteksAccount.getAccountNumber());
        System.out.println(mareksAccount.getBalance());
        System.out.println(mareksAccount.getEmail());
        System.out.println(mareksAccount.getCustomerName());
        System.out.println(barteksAccount.getPhoneNumber());
    }
}
