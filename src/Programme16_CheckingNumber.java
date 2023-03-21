import java.util.Scanner;

/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */
public class Programme16_CheckingNumber {
    public static void main (String[] args)
    {
        Programme16_CheckingNumber search =new Programme16_CheckingNumber();
        search.number();
    }
public void number(){
    Scanner scanner= new Scanner( System.in);
    System.out.println("Enter num");
    int a;
    a = scanner.nextInt();
    if(a>0){
        System.out.println("is positive number");
    }
    else if (a==0){
        System.out.println("is zero number");
    }
    else{
        System.out.println("number is invalid");
    }
    scanner.close();
}
}
