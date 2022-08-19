package day10_if_statements;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Do you practice any sport?" );
        boolean answer = input.nextBoolean();

        if (answer){
            System.out.println("What do you play?");
            String an = input.next();

            System.out.println("Since when have you playing " + an + "?");
            input.nextLine();
        } else System.out.println("What do you for fun?");
        String an = input.nextLine();
        input.nextLine();

        System.out.println("When did you start " + an + " ?");







    }
}
