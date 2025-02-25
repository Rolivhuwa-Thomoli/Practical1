import  java.util.Scanner;
public class Main {
    public static double premium(int currentYear, int birthYear){
        int age = currentYear - birthYear;
        int decade = (age - (age%10))/10;
        return (decade +15)*20;
    }
    public static void main(String[] args) {
        //---------variable declaration--------------
        Scanner inputobj = new Scanner(System.in);
        int currentYear, birthYear;

        //-------prompt------------------------------
        System.out.print("Enter the current year: ");
        currentYear = inputobj.nextInt();
        System.out.print("Enter your Birthyear : ");
        birthYear = inputobj.nextInt();
        //------call function and output-------------
        System.out.println("Your premium is : R" + premium(currentYear,birthYear));
    }
}