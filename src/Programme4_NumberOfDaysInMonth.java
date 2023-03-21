import java.util.Scanner;

public class Programme4_NumberOfDaysInMonth {
    public static void main(String[] args) {
/* The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        If the parameter is not in that range return false/

 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year:");
        int year;
        year= scanner.nextInt();
        if (year >= 1&& year <= 9999){
            System.out.println("True");}
        else {
            System.out.println("False");
            Programme4_NumberOfDaysInMonth DD = new Programme4_NumberOfDaysInMonth();
            DD.calculate();
            DD.getDaysInMonth();
        }
 /*  A year is a leap year then  in the valid range, calculate if the year is a leap year and return true if it is,
        otherwise return false.  /*A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.*/

    }
    public static void calculate() {

        Scanner scanner = new Scanner(System.in);
        int year;
        year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("True");
            System.out.println(year + "is a leap year");
        } else if (year % 400 == 0) {
            System.out.println("False");
            System.out.println(year + " is not a leap year");
        }else{
                System.out.println("incorrect insert");
            }
        }
        public static void getDaysInMonth() {

        /* getDaysInMonth(1, 2020); should return 31 since January has 31 days.
● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 year.
● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 2018 is not a leap year.
● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to 9999
 */
    Scanner scanner =new Scanner( System .in);
            System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
            int month;
            month = scanner.nextInt();
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("\n 31 Days in this Month");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("\n 30 Days in this Month");
                break;
                case 2:
                    System.out.println("\n Either 28 or 29 Days in this Month");
                default:
                    System.out.println("\n Please enter Valid Number");
            }
        scanner.close();
    }

    }
