package day08_Scanner;

import java.util.Scanner;

public class Angles {
    /*Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0

       */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double angle0ne = input.nextInt();
        double angleTwo = input.nextInt();
        double angleThree = input.nextInt();

        double sum = angle0ne + angleTwo +angleThree;

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);











    }









}
