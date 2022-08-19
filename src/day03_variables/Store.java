package day03_variables;

public class Store {
    public static void main(String[] args) {

        int numberOfItems = 1000;
        System.out.println(numberOfItems + " in the store"); // concatenates the value of the numberOfItems variable with the characters 'in the store'
        numberOfItems = 700; // reassigned 700 into variable
        System.out.println(numberOfItems + " after the sale");

        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment); // soutv
        double totalCost = 1_000_000.99;


        float f = 19.99F;  // adding the letter f/F will tell the compiler this is a float number, not a double number

        float f2 = 100;
        System.out.println(f);
        System.out.println(f2);
        // int f2 = 100; valid if i wanted
        // float f2 = 100f;
        // float f2 = 100.99f;

        long population = 8_000_000_000L; // adding l/L to the number will change the type from int(the defualt) to long type, becouse 8 billion was too big to be held in int type
        System.out.println(population);

        long pop = 1_000_000; //







    }
}
