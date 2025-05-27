public abstract class BankAccount{
    private String AccountHolderName;
    private String AccountNumber;
    private double balance;

    //      To access its properties by objects using constructors.
    public BankAccount(String AccountHolderName,String AccountNumber,double balance){
        this.AccountHolderName=AccountHolderName;
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }
    // getters and setters for private attributes.
    public String getAccountHolderName(){
        return  AccountHolderName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }
    public double getBalance(){
        return balance;
    }



    public void setBalance(double balance) {
        this.balance = balance;
    }
    protected void increaseBalance(double amount){
        balance+=amount;
    }
    protected void decreaseBalance(double amount){
        balance-=balance;
    }

    public void setAccountHolderName(String AccountHolderName) {
        this.AccountHolderName = AccountHolderName;

    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
    public abstract void withdraw(double balance) throws InsufficientBalanceException;
    public abstract void deposit(double amount);

    // for displaying information
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }
}