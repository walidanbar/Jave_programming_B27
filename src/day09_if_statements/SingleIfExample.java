package day09_if_statements;

public class SingleIfExample {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Hello");
        }

        if (false) {
            System.out.println("Bye");
        }
        System.out.println("___________________________");
        int year = 2020;
        if (year == 2020 || year == 2021) {
            System.out.println("Stay home");
            System.out.println("Wash your hands");
            System.out.println("social distance");
        }

        System.out.println("------------------");

        double price = 39.99;

        if (price >= 20) {
            System.out.println("Free shipping");


        }


    }
}
