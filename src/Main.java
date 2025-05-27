import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rural Bank of Nepal!!!!");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name= sc.nextLine();
        Customer customer= new Customer(name);
//creating object of saving and current account
        SavingsAccount saving= new SavingsAccount("Riddhishree Khanal","000125",2000.8,5);
        CurrentAccount current = new CurrentAccount("Ram kumar", "351001",10360);

        //Add to customer accounts list.
        customer.addAccount(saving);
        customer.addAccount(current);
//
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Add Interest (Saving account Only)");
            System.out.println("4. View Accounts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Select account (1: Saving, 2: Current): ");
                    int depositAcc = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double depositAmount = sc.nextDouble();
                    if (depositAcc == 1) saving.deposit(depositAmount);
                    else if (depositAcc == 2) current.deposit(depositAmount);
                    else System.out.println("Invalid account choice.");
                    break;

                case 2: // Withdraw
                    System.out.print("Select account (1: Savings, 2: Current): ");
                    int withdrawAcc = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        if (withdrawAcc == 1) saving.withdraw(withdrawAmount);
                        else if (withdrawAcc == 2) current.withdraw(withdrawAmount);
                        else System.out.println("Invalid account choice.");
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Withdrawal failed: " + e.getMessage());
                    }
                    break;

                case 3: // Add Interest
                    saving.addInterest();

                    break;

                case 4: // View Accounts
                    customer.showAllAccounts();
                    break;

                case 5:
                    exit = true;
                    System.out.println("Thank you for using Rural Bank of Nepal.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}