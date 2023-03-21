import java.time.Year;
import java.util.Scanner;

/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
public class Programme2_LeapYear {
    public static void main(String[] args) {
        Programme2_LeapYear leapYear = new Programme2_LeapYear();
        //calling in to main method
        leapYear.isLeapYear();
    }
    public void isLeapYear() {
        int year;
        Scanner scanner = new Scanner(System.in);//scanner
        System.out.println("Enter an year: ");
        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Specified year is leap year");
        else
            System.out.println("Specified year is not a leap year");
        scanner.close();
    }
}








