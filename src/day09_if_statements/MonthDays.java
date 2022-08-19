package day09_if_statements;

import java.time.Month;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println(" What is the month ? ");

        int month = input.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println( "Month " + month + " has 31 days ");

        } else if  (month == 4 || month == 6 || month == 9 || month == 11 ) {
            System.out.println("Month " + month + " has 30 days ");
        } else {System.out.println( month + " 28 days " );}




    }
}
