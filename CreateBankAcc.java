public class CreateBankAcc {
    private String accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
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


    public void deposit(int depositAmount){
        this.accountBalance += depositAmount;
        System.out.println("You deposit amount is" + depositAmount + " .Your new balalnce is "+this.accountBalance+".");
    }

    public void withdrawFunds(int withdrawAmount){
        if(this.accountBalance - withdrawAmount < 0){
            System.out.println("Insufficients Funds! You only have "+this.accountBalance +"." );
        }else{
            this.accountBalance -= withdrawAmount;
            System.out.println("Your withdraw Amount is "+withdrawAmount +" .Your new Balance is " + this.accountBalance+".");
        }
    }
    



}
