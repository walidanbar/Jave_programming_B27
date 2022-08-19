package day12_switch;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number");
        int month = input.nextInt();

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("It is winter, so wear a winter coat, gloves and a hat");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is spring, so wear lighter clothes");
        break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is Summer, so go beach and picnic ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is Fall");
                break;
            default:
                System.out.println("Invalid number");




        }
















    }
}
