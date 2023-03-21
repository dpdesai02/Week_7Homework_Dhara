import java.util.Scanner;

/*
Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.
 */
public class Programme11_PrintNumber {
    public static void main(String[] args) {
        Programme11_PrintNumber S= new Programme11_PrintNumber();
        S.Number();

    }
    public static void Number(){
        Scanner scanner = new Scanner(System.in);
    System.out.println("\nDivided by 3:");
        for (int i = 1; i < 100; i++) {
        if (i % 3 == 0)
            System.out.print(i + ", ");
    }
        System.out.println("\nDivided by 5:");//value divided by 5
        for(int i =1; i<100; i++){
        if (i % 5 == 0)
            System.out.print(i + ", ");
        scanner.close();//scanner closing
    }
}

}
