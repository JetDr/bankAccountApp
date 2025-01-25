public class testClass {
    public static void main(String[] args) {
        // Create a CheckingAccount object
        checkingAccount myAccount = new checkingAccount(0.02);

        // Set account details
        myAccount.setFirstName("Ninja");
        myAccount.setLastName("Turtle");
        myAccount.setAccountID(8675309);

        // Deposit money
        myAccount.deposit(2000.0);

        // Withdraw money (valid amount)
        myAccount.withdrawal(900.0);

        // Try to withdraw more than the balance
        myAccount.processWithdrawal(1200.0);

        // Display account summary
        myAccount.displayAccount();
    }
}

