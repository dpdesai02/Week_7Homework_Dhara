import java.util.Scanner;

/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
public class Programme7_SellersCommission {
    public static void main(String[] args) {
        Programme7_SellersCommission sc = new Programme7_SellersCommission();
        sc.commission();

    }
public static void commission(){
    Scanner scanner= new Scanner(System.in);
    int sales_id;
    System.out.println("Enter Sales_id: " );
    sales_id=scanner.nextInt();
    String seller_name;
    System.out.println("Enter seller_name: ");
    seller_name= scanner.next();
    double sales_amount;
    System.out.println("Enter sales_amount: ");
    sales_amount = scanner.nextDouble();
    float salary_basic;
    System.out.println("Enter salary_basic: ");
    salary_basic = scanner.nextFloat();

    double sales_commissions;
    if (sales_amount>30000 && sales_amount>= 50000){
        System.out.println("your commission is " + sales_amount * 35 / 100);
    } else if (sales_amount >20000 && sales_amount <= 30000) {
        System.out.println("your commission is " + sales_amount *20 / 100);
    } else if (sales_amount >= 10000 && sales_amount<= 20000) {
        System.out.println("your commission is " + sales_amount * 10 / 100);
    } else if (sales_amount == 10000) {
        System.out.println("your commission is " + sales_amount *5 / 100);
    } else {
        System.out.println("your commission is " + sales_amount * 2 / 100);
    }
    scanner.close();

    }
    /*
   double soldValue;
        if (totalSold <  ) {
            soldValue =(totalSold * 1.01);
        }else if(totalSold >= ){
            soldValue =(totalSold * 1.025);
        }else if(totalSold >= ){
            soldValue =(totalSold * 1.035);
        }else{
            soldValue = 0;
        }
        return soldValue;
    }
 if ( sales >30000  && sales >= 50000) {
            System.out.println("your commission is " + sales * 35 / 100);
        } else if (sales >20000 && sales <= 30000) {
            System.out.println("your commission is " + sales *20 / 100);
        } else if (sales >= 10000 && sales<= 20000) {
            System.out.println("your commission is " + sales * 10 / 100);
        } else if (sales == 10000) {
            System.out.println("your commission is " + sales *5 / 100);
        } else {
            System.out.println("your commission is " + sales * 2 / 100);
        }
 */

}

