public class CurrentAccount extends BankAccount{
    private double overdraftlimit= 1000;

    public CurrentAccount(String AccountHolderName, String AccountNumber, double balance) {
        super(AccountHolderName, AccountNumber, balance);


    }
    public void deposit(double amount){
        increaseBalance(amount);
        System.out.println("Deposit Successful!!");
    }
    public void withdraw (double amount) throws InsufficientBalanceException{
        if (amount>getBalance()+overdraftlimit){
            throw new InsufficientBalanceException("overdraft limit reached");
        }else{
            decreaseBalance(amount);
            System.out.println("Withdrawl Successful!");
        }
    }


}