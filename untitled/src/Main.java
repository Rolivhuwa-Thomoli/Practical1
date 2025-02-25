import java.util.Scanner;
public class Main {
    public static double prompt(){
        Scanner inputobj = new Scanner(System.in);
        System.out.print("Please Enter the initial amount: R");
        return inputobj.nextDouble();
    }
    public  static double savings(double initialAmount){
        return initialAmount + 0.05*initialAmount;
    }
    public static void main(String[] args) {

        System.out.println("Final amount is : R" + savings(prompt()));
    }
}