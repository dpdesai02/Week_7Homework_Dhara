import java.util.Scanner;

/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|
 */
public class Programme5_SalarySlip {
    public static void main(String[] args) {
        Programme5_SalarySlip salarySlip = new Programme5_SalarySlip();
                salarySlip.Programme5_SalarySlip();//calling in to main method

    }
    public static void Programme5_SalarySlip(){
    int id;
    double b;
    String name;
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
    id = scanner.nextInt();

        System.out.println("Enter Employee Name:");
    name = scanner.next();

        System.out.println("Enter basic salary");
    b = scanner.nextDouble();
    double c = b * 10/100;
    double d = b * 8/100;
    double e = b * 9/100;
    double f = b * 20/100;
    double g = b+c+d+e-f;

        System.out.println("_________________________________________");
        System.out.println("|               Salary Slip              |");
        System.out.println("|________________________________________|");
        System.out.println("|Employee Id        : " + id +          "|");
        System.out.println("|Employee Name      : " + name +        "|");
        System.out.println("|________________________________________|");
        System.out.println("|Basic Salary       : " + b +           "|");
        System.out.println("|HRA 10%            : " + c  +          "|");
        System.out.println("|TA 8%              : " + d + "          |");
        System.out.println("|DA 9%              : " + e + "          |");
        System.out.println("|PF -20%            : " + f + "          |");
        System.out.println("|________________________________________|");
        System.out.println("|Gross Salary       : " + g + "          |");
        System.out.println("|========================================|");
        scanner.close();//scanner closing
}
}
