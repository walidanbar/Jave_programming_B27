package day11_nested;

public class NestedExample {
    public static void main(String[] args) {
        double price = 100.99;
        boolean isPrime = false;

        if(isPrime) {
            System.out.println("Free 2 day shipping");
        } else {
            // you don't have prime

            if(price >= 25){
                System.out.println("Free shipping available");
            } else {
                System.out.println("Shipping cost is $2.99");
            }

        }

        /*

        if the boolean isPrime is true if the blocks runs
        if the boolean isPrime is false if the else block, which has a if statement
            that if condition is checked
                   price >= 25: free shipping
                   false: pay for shipping
         */











    }
}
