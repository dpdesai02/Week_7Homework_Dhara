import java.util.Scanner;

/*
Same as above program-8 using switch statement.
 */
public class Programme9_CityNameSwitchStatement {
    public static void main(String[] args) {
        Programme9_CityNameSwitchStatement cn = new Programme9_CityNameSwitchStatement();
        cn.AtoF();//calling in to main method

    }

    public void AtoF() {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\"Please enter first letter of city name between A to F:");
        ch = scanner.next().charAt(0);

        switch (ch){
            case 'a':
            System.out.println("Name of the city is Abingdon");
            break;
            case 'A':
            System.out.println("Name of the city is Abingdon");

            break;
            case 'b':
            System.out.println("Name of the city is Brighton");
            break;
            case 'B':
            System.out.println("Name of the city is Brighton");

            break;
            case 'c':
            System.out.println("Name of the city is Cambridge");
            break;
            case'C':
            System.out.println("Name of the city is Cambridge");

            break;
            case 'd':
            System.out.println("Name of the city is Dartford");
            break;
            case 'D':
            System.out.println("Name of the city is Dartford");

            break;
            case 'e':
            System.out.println("Name of the city is Edinburgh");
            break;
            case 'E':
            System.out.println("Name of the city is Edinburgh");

            break;
            case 'f':
            System.out.println("Name of the city is Failsworth");
            break;
            case'F':
            System.out.println("Name of the city is Failsworth");

            break;
            default:
            System.out.println("Another city's name are invalid ");

        }
           scanner.close();//closing scanner
    }
}