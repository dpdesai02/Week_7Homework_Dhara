import java.util.Scanner;

/*
Write a Java program to calculate the average value of array elements.
 */
public class Programme19_AvarageValueOfArray {
    public static void main(String[] args) {

        Programme19_AvarageValueOfArray av=new Programme19_AvarageValueOfArray();
        av.avarage();
    }

    public void avarage() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        int average = sum/numbers.length;
        System.out.println("Average value of array elements" +  average);

    }

}


