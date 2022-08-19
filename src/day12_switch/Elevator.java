package day12_switch;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Which floor?");
        int floor = input.nextInt();
        switch (floor) {

            case 1:

                System.out.println("Lobby");
                System.out.println("StarBucks");
                System.out.println("Amazon");
                System.out.println("Pick up");
                break;
            case 2:

                System.out.println("NASA");
                System.out.println("Cydeo");
                System.out.println("Discover");
                break;
            case 3:

                System.out.println("Uber");
                System.out.println("Lyft");
                System.out.println("chase");
                break;
            case 4:

                System.out.println("Rooftop");
                System.out.println("Lounge");
                break;
            default:
                System.out.println("Invalid Floor Selected");

        }


    }



    }


