import java.util.Scanner;

/*
Write a Java program to test if an array contains a specific value.
  */
 public class Programme20_SpecificValueOfArray {
 public static void main(String[] args) {
  Programme20_SpecificValueOfArray SA = new Programme20_SpecificValueOfArray();
  SA.specific();

 }

 public void specific(){
  Scanner scanner =new Scanner(System.in);
  System.out.println(" Enter any value: ");
  int bar[]={1,2,3,4,5,6,7,8,9,10};
  int num;
  num=scanner.nextInt();
  for (int i= 0;i < bar.length; i ++){
   if (num == bar[i]){
    System.out.println("Array contains the given element");
   }
   else {
    System.out.println("Array is not contains the given element");
    scanner.close();
   }
  }

 }
}





