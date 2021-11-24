public class BankAccount {
    private  String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public  BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, int balance, String customerName, String email, String phoneNumber){
        
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println("Constructor with parameters called");
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

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }





    public int depositFunds(int balance){
        System.out.println("deposit: " + balance + ". Balance now: " + (this.balance+=balance));
         return this.balance += balance;

    }

    public  int withdrawFunds(int balance){
        if(this.balance>=balance){
            System.out.println("withdraw: " + balance + ". Balance now: " + (this.balance-balance));
            return this.balance -= balance;
        }

        else{
            System.out.println("Can't withdraw: " + balance + ": withdraw "+this.balance+". Balance now: 0");
            this.balance = 0;
            return balance;
        }


    }
}
