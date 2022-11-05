public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.depositMoney(200.00, "checkings");
        account1.depositMoney(400.00, "savings");
        account1.showTotal();
        account1.showAccounts();
        account1.withdrawMoney(100, "checkings");
        account1.showTotal();
    }
}