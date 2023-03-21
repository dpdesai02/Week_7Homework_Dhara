import java.util.Scanner;

/*
Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12_InputValue {

    public static void main(String[] args) {
        Programme12_InputValue a =new Programme12_InputValue();
        a.value();// calling variable method in to static method

    }
public static void value(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any value:");
        char ch = scanner.next(). charAt(0);
        if ((ch>= 'a' && ch<= 'z') || (ch>= 'A' && ch <= 'Z')){
            System.out.println(ch + " is alphabet.");
        }
        else if (ch>='0' && ch <= '9'){
            System.out.println(ch + " is a digit.");
        }
        else {
            System.out.println(ch + " is a special character.");
        }
        scanner.close();
    }
}
