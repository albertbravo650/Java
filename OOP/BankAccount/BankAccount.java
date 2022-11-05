public class BankAccount {
    private double checkingsBalance;
    private double savingsBalance;
    private static int numOfAccounts = 0;
    private static double totalOfAccounts = 0;

    public BankAccount() {
        numOfAccounts++;
    }

    public double getCheckings() {
        return checkingsBalance;
    }

    public double getSavings() {
        return savingsBalance;
    }

    public void depositMoney(double amount, String account) {
        if(account == "checkings") {
            checkingsBalance += amount;
            totalOfAccounts += amount;
        }
        else if(account == "savings") {
            savingsBalance += amount;
            totalOfAccounts += amount;
        }
        else {
            System.out.println("Select either checkings or savings..");
        }
    }

    public void withdrawMoney(double amount, String account) {
        if(account == "checkings") {
            if((checkingsBalance - amount) < 0) {
                System.out.println("Insufficient funds");
            } else {
                checkingsBalance -= amount;
                totalOfAccounts -= amount;
            }
        }
        else if(account == "savings") {
            if((savingsBalance - amount) < 0) {
                System.out.println("Insufficient funds");
            } else {
                savingsBalance -= amount;
                totalOfAccounts -= amount;
            }
        }
        else {
            System.out.println("Select either checkings or savings..");
        }
    }

    public void showTotal() {
        System.out.println("Checkings: " + checkingsBalance);
        System.out.println("Savings: " + savingsBalance);
        System.out.println("Total: " + (checkingsBalance + savingsBalance));
    }

    public void showAccounts() {
        System.out.println("Number of accounts: " + numOfAccounts);
    }
}