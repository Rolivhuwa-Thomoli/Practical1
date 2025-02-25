import java.util.Scanner;

public class Main {
    public static double overtimePay(double payRate, int regularhrs, int overtimehrs){
        return (regularhrs*payRate)+(overtimehrs*1.5*payRate);
    }
    public static void main(String[] args) {
        Scanner inputobj = new Scanner(System.in);
        double payRate;
        int regularhrs, overtimehrs;
        System.out.print("Enter the hourly pay rate: ");
        payRate = inputobj.nextDouble();
        System.out.print("Enter your regular work hours : ");
        regularhrs = inputobj.nextInt();
        System.out.print("Enter your overtime work hours: ");
        overtimehrs = inputobj.nextInt();
        System.out.println("Your overtime pay is : R" + overtimePay(payRate,regularhrs,overtimehrs));
    }
}