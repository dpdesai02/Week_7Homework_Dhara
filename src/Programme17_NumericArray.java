import java.util.Arrays;
import java.util.Scanner;

/*
Write a Java program to sort a numeric array and a string array.
 */
public class Programme17_NumericArray {
    public static void main(String[] args) {
        Programme17_NumericArray obj = new Programme17_NumericArray();
        obj.numstring();//calling in to main method
    }

        public void numstring(){

        int[] a = {11, 22, 33, 44, 55, 66, 77, 88};//array type numeric


        System.out.println("original numeric array");

        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println("sort a numeric array:");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        String[] name = {"London,Paris,NewYork,Spain,Italy"};
        for (String i : name) {//array type string
            System.out.println(i + " ");
            System.out.println("sort string array: ");
            Arrays.sort(name);
            System.out.println(Arrays.toString(name));

        }

    }
}
