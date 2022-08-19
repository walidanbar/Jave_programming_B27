package day08_Scanner;
 import java.util.Scanner;

public class revenue {
    public static void main(String[] args) {

        /*
        Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price quantity.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the items price");
        double price = scan.nextDouble();
        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        System.out.println("Revenue : " + price * quantity);




    }

}
