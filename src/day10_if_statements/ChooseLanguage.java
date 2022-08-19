package day10_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        /*ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French
        based on the number they picked print a message:
        1 : "hello, thank for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        any other number: "We will use English by default"
        Extra: add your own options
             */

        System.out.println("-------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Choose the language ");
        int number = input.nextInt();
        if (number == 1){
            System.out.println("مرحباً، شكراً على الإتصال");
        } else if (number == 2) {
            System.out.println("hola, gracias para llamar");
        } else if (number == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (number == 4) {
            System.out.println("privet, spasibo za vash zvonok");
        } else if (number == 5) {
            System.out.println("Merci ,pour votre appel");
        } else System.out.println("hello, thank for your call");



    }
}
