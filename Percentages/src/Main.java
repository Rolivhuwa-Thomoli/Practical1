import java.util.Scanner;
public class Main {
    public static void computePercent(double num1, double num2){
        System.out.println("num1 is "+ num1 + " num2 is " + num2);
        System.out.println(num1 +" is "+ (num1/num2)*100 + "% of "+ num2);

    }

    public static void main(String[] args) {
        //Declare variables
        Scanner inputobj = new Scanner(System.in);
        double num1, num2;
        //--------prompt-------------------------------------
        System.out.print("Please enter a double value: ");
        num1 = inputobj.nextDouble();
        System.out.print("Please enter a double value: ");
        num2 = inputobj.nextDouble();
        //--------call functions----------------------------
        computePercent(num1,num2);
        computePercent(num2,num1);
    }
}