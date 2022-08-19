package day6_arithmetic_operators;

public class RelationalTasks {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 50;

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);

        System.out.println("-------------------------");

        int number = -4;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;


        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);

        /* define a number , find out if it is even or odd

         */

        int num =20;
        boolean isEven = num % 2 == 0;
        boolean isOdd = num %2 != 0; // num % 2 == 1 // isEven != true







    }
}
