package day19_loop;

import java.util.Scanner;

public class Factorial {
    /*
    write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {

        int num = new Scanner(System.in).nextInt();
        long factorial = 1;
        String msg = num + "! = ";

        for(int i = num; i > 1; i--){
            factorial *= i;
            msg += i + " * ";
        }
        msg += "1 = " + factorial;
        System.out.println(factorial);
        System.out.println(msg);


    }








    }

