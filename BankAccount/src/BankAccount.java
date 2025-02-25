public class BankAccount {
    private String name;
    private int accNumber;
    private double accBalance;

    BankAccount(){
        name = "new user";
        accNumber = 9999999;
        accBalance = 0;
    }

    public String getName(){
        return name;
    }
    public int getAccNumber(){
        return accNumber;
    }
    public double getAccBalance(){
        return  accBalance;
    }
    public void setName(String input){
        name = input;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void deposit(double deposit) {
        this.accBalance += deposit;
    }
    public void deductMonthlyFee(){
        accBalance -= 8;
    }
    public void explainAccountPolicy(){
        System.out.println("ZAR4.00 service fee will be deducted each month.");
    }
}
