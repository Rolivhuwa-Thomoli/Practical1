import  java.util.Scanner;
public class Main {
    public static double premium(int currentYear, int birthYear){
        int age = currentYear - birthYear;
        int decade = (age - (age%10))/10;
        return (decade +15)*20;
    }
    public static void main(String[] args) {
        Scanner inputobj = new Scanner(System.in);
        int currentYear, birthYear;

        //System.out.println((34 - (34%10))/10); //decade
        System.out.print("Enter the current year: ");
        currentYear = inputobj.nextInt();
        System.out.print("Enter your Birthyear : ");
        birthYear = inputobj.nextInt();
        System.out.println("Your premium is : R" + premium(currentYear,birthYear));
    }
}