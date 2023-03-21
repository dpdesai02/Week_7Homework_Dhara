import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

/*
Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */
public class Programme1_InputNumber {
    public static void main(String[] args) {
        Programme1_InputNumber();//calling in to main method
    }
        //static method
        public static void Programme1_InputNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");//printing statement
        int num = scanner.nextInt();
        String Programme1_InputNumber =(num%2 ==0)?"even":"odd";
        System.out.println(num + "is"+ Programme1_InputNumber);
        scanner.close();}//closing scanner
    }




