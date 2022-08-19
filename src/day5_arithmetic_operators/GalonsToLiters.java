package day5_arithmetic_operators;

public class GalonsToLiters {
    public static void main(String[] args) {
        // write a program that can convert the gallons to litters
        //            Ex:
        //                gallon = 10;
        //                output:
        //                    10 gallons equal to 37.8541 liters
        //                gallon = 20
        //                 output:
        //                    20 gallons equal to 75.7082 liters

        double gallon = 37.8541 / 10;
        System.out.println(gallon);
          gallon = 3.78541;

         String tenGallons = (10 * gallon) + " liters";
         String twentyGallons = (20 * gallon) + " liters";
         String twentyTwoGallons = (22 * gallon) + " liters";

        System.out.println("ten Gallons = " + tenGallons);
        System.out.println("twenty Gallons = " + twentyGallons);
        System.out.println("twenty Two Gallons = " + twentyTwoGallons);









    }
}
