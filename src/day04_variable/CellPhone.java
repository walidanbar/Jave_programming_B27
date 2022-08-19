package day04_variable;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "IPhone x";
        String color = "Rose gold";
        double price = 100.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';

        System.out.println("\nPhone information:\nBrand: " + brand);
        System.out.println(model + "in " + color);
        System.out.println("with" + size + "gb the price is $" + price);
        System.out.println(" sim type: " + sim + " and has a camera: " + hasCamera);

        // alternative solution:

        String report = "\nPhone information:\nBrand: " + brand +
                "\n" + model + "in " + color +
                "\nWith" + size + "gb the price is $" + price +
                "\nsim type: " + sim + " and has a camera: " + hasCamera;

        System.out.println(report);






    }
}
