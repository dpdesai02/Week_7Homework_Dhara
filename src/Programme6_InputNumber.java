import java.util.Scanner;

/*
Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6_InputNumber {
    public static void main(String[] args) {
        Programme6_InputNumber inputNumber = new Programme6_InputNumber();
        inputNumber.Programme6_InputNumber();//calling in main method

    }
    public void Programme6_InputNumber(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
        scanner.close();//scanner closing
    }
}
