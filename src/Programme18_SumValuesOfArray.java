import java.util.Enumeration;

/*
Write a Java program to sum values of an array.
 */
public class Programme18_SumValuesOfArray {
    public static void main(String[] args) {
        Programme18_SumValuesOfArray S = new Programme18_SumValuesOfArray();
        S.value();
    }

    public void value() {
        int[] a = {11, 22, 33, 44, 55};
        int sum = 0;

        for (int num : a) {
            sum = sum + num;
            System.out.println("Sum of array element is:" + num);
        }
    }
}




