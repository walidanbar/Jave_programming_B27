package day10_if_statements;

public class ClassDiver {
    public static void main(String[] args) {
        /*you are diving in the ocean. Your oxygen tank has a certain level (number)

declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at 50%
             */
        int oxLevel = 85;
        String message;



        if (oxLevel >= 90){
            System.out.println("Your tank is full");
        } else if (oxLevel >= 80) {
            System.out.println("Still okay");
        } else if (oxLevel >= 70) {
            System.out.println("Don't go too far");
        } else if (oxLevel > 60) {
            System.out.println("Start to head  back");
        }else if (oxLevel > 50){
            System.out.println("Be careful now you at 50%");
        }


    }
}
