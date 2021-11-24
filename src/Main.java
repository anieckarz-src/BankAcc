public class Main {

    public static void main(String[] args) {
        BankAccount adriansAccount = new BankAccount("231321312", 4000, "Adrian", "dsadas@gmail.com", "312312123");
        BankAccount barteksAccount = new BankAccount();

        System.out.println("balance: " + adriansAccount.getBalance());
        adriansAccount.withdrawFunds(1000);
        adriansAccount.depositFunds(1000000);

    }
}
