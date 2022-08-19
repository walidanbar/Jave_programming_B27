package day22_array;

import java.util.Scanner;

public class ClassMeeting {
    public static void main(String[] args) {

        int n = 3;
        boolean isPrime = true;

        if (n < 2) {
            System.out.println("Not Prime");
            System.exit(0);
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}