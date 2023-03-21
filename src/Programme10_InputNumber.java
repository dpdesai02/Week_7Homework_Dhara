import java.util.Scanner;

/*
Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */
public class Programme10_InputNumber {
    public static void main(String[] args) {
        Programme10_InputNumber add =new  Programme10_InputNumber();
        add.Input();//calling static variable in to main method

    }

    public static void Input (){
        Scanner scanner= new Scanner(System.in);
        float num1, num2, res;
        char ch;

        System.out.println("Enter any Two Numbers: ");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        System.out.println("Enter the Operator (+, -, *, /): ");
        ch = scanner.next().charAt(0);
        if(ch == '+') res = num1 + num2;
        else if(ch == '-') res = num1 - num2;
        else if(ch == '*') res = num1 * num2;
        else if(ch == '/') res = num1 / num2;
        else
        {
            System.out.println("\nInvalid Input");
            return;
        }
        System.out.println("\nResult = " + res);
        scanner.close();//closing scanner
    }
}

