import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    //    one customer can have multiple account so using aggregation
    private List<BankAccount> accounts =new ArrayList<>();
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);

    }

    public void showAllAccounts() {
        for (BankAccount account : accounts) {
            account.displayAccountDetails(); // polymorphic call
        }


    }

}