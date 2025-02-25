public class Main {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setName("Rolivhuwa");
        obj1.setAccNumber(747392);
        obj1.deposit(100);
        System.out.println("The account has the following details");
        System.out.println("name : " + obj1.getName() + " account number: " + obj1.getAccNumber() + " Balance : "+ obj1.getAccBalance());
        obj1.deductMonthlyFee();
        obj1.explainAccountPolicy();
        System.out.println("After deducting monthly fee");
        System.out.println("The account has the following details");
        System.out.println("name : " + obj1.getName() + " account number: " + obj1.getAccNumber() + " Balance : "+ obj1.getAccBalance());
    }
}