package day24_array;

public class PrimeNum {
    public static void main(String[] args) {
        // find the prime numbers between one and 50

        int num = 50;



        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;

                }


            }
            if (isPrime) {
                System.out.println(i);
            }

        }
    }
}
