import java.util.Scanner;

/*
Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|
 */
public class Programme3_MarkSheet {
    public static void main(String[] args) {
        Programme3_MarkSheet markSheet= new Programme3_MarkSheet();
        markSheet.Programme3_MarkSheet();//calling in to main method

    }
    public void Programme3_MarkSheet() {
        String result, grade =null;
        Scanner scanner= new Scanner(System.in);//scanner

        System.out.println("Enter Student Name");//entering string details
        String studname =scanner.next();

        System.out.println("Enter student roll no");
        int rollno= scanner.nextInt();

        System.out.println("Enter marks of the Maths");
        int maths = scanner.nextInt();
        while (maths >100 || maths < 0 ){
            System.out.println("Invalid Input,Maths Marks should be between 0 to 100");
            maths=scanner.nextInt();
        }
        System.out.println("Enter marks of the Science");
        int science = scanner.nextInt();
        while (science>100||science< 0){
            System.out.println("invalid Input,Science Marks should be between 0 to 100");
        }
        System.out.println("Enter marks of the English");
        int english = scanner.nextInt();
        while (english>100||science< 0){
            System.out.println("invalid Input,English Marks should be between 0 to 100");
        }
        float total= maths + science + english;
        System.out.println("Total marks for Maths +Science + English is:"+ total);

        float percentage = total *100/300;
        System.out.println("Percentage of all three subject is"+ percentage);

        if (percentage >=35){
            result = "pass";
        }
        else {
            result = "Fail";
           // System.out.println("Fail");
        }
        System.out.println(result);

        if (percentage>=80){
            grade ="A+";
            System.out.println("Grade :"+ grade);}
        else if (percentage >= 60 && percentage <80) {
            grade ="A";
            System.out.println("Grade :"+ grade);}
        else if (percentage>=50 && percentage <60) {
            grade="B";
            System.out.println("Grade :"+ grade);}
        else if (percentage >=35 && percentage<50) {
            grade="C";
            System.out.println("Grade :"+ grade);}
        else {
            grade ="";}
        System.out.println("|---------------------------------|");
        System.out.println("|         Mark Sheet              |");
        System.out.println("|---------------------------------|");
        System.out.println("| Name:       " + studname + "                 |");
        System.out.println("| Roll No:    " + rollno + "                  |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Subjects        Marks          |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Maths           " + maths + "  |");
        System.out.println("|  Science         " + science + "     |");
        System.out.println("|  English         " + english + "     |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Total:          " + total + "          |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Percentage:     " + percentage + "         |");
        System.out.println("|  Result:         " + result + " |");
        System.out.println("|  Grade:          " + grade + "  |");
        System.out.println("|---------------------------------|");

    scanner.close();
        }

    }











