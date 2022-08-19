package day04_variable;

public class Recap {

    public static void main(String[] args) {

        // declare variable
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkillsDays;


        // assigning value to variable
        temperature = 74.2;
        numberOfJavaDays = 4;
        numberOfSoftSkillsDays = 2;

        System.out.println("temperature = " + temperature + " c ");
        System.out.println("numberOfJavaDays = " + numberOfJavaDays);
        System.out.println("numberOfSoftSkillsDays = " + numberOfSoftSkillsDays);

        // declare and assign at the same time
        int numberOfCoffeeCups = 2;
        float ratingOfMovie = 8.9F; // compiler takes 8.9 as double type
        long waterInOcean = 200_000_000_000L; // compiler takes 200000000000 as int type, but this number is too big for int, so doesn't compile, we need to add L to make it long type.
        System.out.println("numberOfCoffeeCups = " + numberOfCoffeeCups);
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("waterInOcean = " + waterInOcean + " liters ");



    }




}
