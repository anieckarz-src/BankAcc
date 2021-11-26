public class BankAccount {

    private String accountNumber;
    private int balance;
    private String customerName;
    private String customerPin;


    public void depositFunds(int money) {
        System.out.println("\ndeposit: " + money + ". Balance now: " + (this.balance += money));

    }

    public void withdrawFunds(int money) {
        if (this.balance >= money) {
            System.out.println("\nwithdraw: " + money + ". Balance now: " + (this.balance -= money));
        } else {
            System.out.println("\nCan't withdraw: " + money + ": withdraw " + this.balance + ". Balance now: 0");
            this.balance = 0;
        }


    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getCustomerPin() {
        return customerPin;
    }

    public void setCustomerPin(String customerPin) {
        this.customerPin = customerPin;
    }
}
