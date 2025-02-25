import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputobj = new Scanner(System.in);
        //----create new object of type BankAccount----------------------------
        BankAccount obj1 = new BankAccount();
        //---------prompt-----------------------------
        System.out.print("Enter account name: ");
        String name = inputobj.next();
        System.out.print("Enter account number: ");
        int accountnum = inputobj.nextInt();
        System.out.print("Enter deposit: ");
        double deposit = inputobj.nextDouble();
        //----Initialize object-------------------------------------------------
        obj1.setName(name);
        obj1.setAccNumber(accountnum);
        obj1.deposit(deposit);
        //-----current state of object--------------------------------------
        System.out.println();
        System.out.println("The account has the following details");
        System.out.println("name : " + obj1.getName() + " account number: " + obj1.getAccNumber() + " Balance : "+ obj1.getAccBalance());
        obj1.deductMonthlyFee();
        obj1.explainAccountPolicy();
        System.out.println();
        System.out.println("After deducting monthly fee");
        //------state of object after deduction-------------------------------
        System.out.println("The account has the following details");
        System.out.println("name : " + obj1.getName() + " account number: " + obj1.getAccNumber() + " Balance : "+ obj1.getAccBalance());
    }
}