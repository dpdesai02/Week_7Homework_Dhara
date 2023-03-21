import java.util.Scanner;

/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
public class Programme8_CityName {
    public static void main(String[] args) {
        Programme8_CityName cn = new Programme8_CityName();
        cn.AtoF();//calling in to main method

    }

    public void AtoF() {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet 'A to F':");
        ch = scanner.next().charAt(0);

        if ((ch == 'a') || ( ch == 'A')) {
            System.out.println("Name of the city is Abingdon");
        }

        else if ((ch == 'b') || ( ch == 'B')){
            System.out.println("Name of the city is Brighton");
        }
        else if ((ch == 'c') || ( ch == 'C')) {
            System.out.println("Name of the city is Cambridge");
        }
        else if ((ch == 'd') || ( ch == 'D')){
            System.out.println("Name of the city is Dartford");
        }
        else if ((ch == 'e') || ( ch == 'E')){
            System.out.println("Name of the city is Edinburgh");
        }
        else if ((ch == 'f') || ( ch == 'F')){
            System.out.println("Name of the city is Failsworth");
        }

        else{
            System.out.println("Another city's name are invalid ");

        }
        scanner.close();//closing scanner
    }
}
