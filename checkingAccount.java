public class checkingAccount extends bankAccount{
    private double interestRate;

    // Constructor
    public checkingAccount(double interestRate) {
        super(); // Calls the BankAccount constructor
        this.interestRate = interestRate;
    }

    // Getters and Setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Methods
    public void processWithdrawal(double amount) {
        if (amount > getBalance()) {
            System.out.println("Overdraft! A $30 fee will be applied.");
            
            // Withdraw the available balance
            double availableBalance = getBalance();
            super.withdrawal(availableBalance); // Withdraw available balance
            
            // Apply overdraft fee
            double overdraftFee = 30.0;
            double newBalance = - (amount - availableBalance + overdraftFee); // Calculate new balance after overdraft fee
            
            // Set the balance to the new balance
            super.withdrawal(newBalance); // This updates the balance correctly
            
            // Display the new balance
            System.out.println("New Balance (Overdraft): $" + newBalance);
        } else {
            super.withdrawal(amount);
        }
    }    

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    } 
}
