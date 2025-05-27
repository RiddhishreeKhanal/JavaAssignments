public class SavingsAccount extends BankAccount {
    private double interestRate = 0.5;

    public SavingsAccount(String AccountHolderName, String AccountNumber, double balance, double interestRate) {
        super(AccountHolderName, AccountNumber, balance);
        this.interestRate = interestRate;

    }

    public void addInterest() {
        double interest= interestRate*getBalance();
        increaseBalance(interest);
        System.out.println("Interest Added: "+interest);

    }
    public void deposit(double amount){
        increaseBalance(amount);
        System.out.println("Deposit Successful!!");
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException{
        if (amount == 0 && amount < getBalance()) {
            throw new InsufficientBalanceException("Not enough balance.");

        }else{
            decreaseBalance(amount);
            System.out.println("Withdrawl Successful!");
        }
    }
}