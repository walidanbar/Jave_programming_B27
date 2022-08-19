package day15_string;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
        /*declare a String for the website and check if it is valid

        website should start with: www.

                website should end with one of the following:
            .com
                .edu
                .gov
                .net

        valid website or invalid website
        bonus: why the website is invalid
                */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your website");
        String website = input.next();

        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") ||website.endsWith(".gov") ||website.endsWith(".net");

        if (validEnd&& validStart){
            System.out.println(website + " is valid");
        }else{
            System.out.println(website + " is invalid");

            if (!validStart){
                System.out.println("website should start with www. ");
            }
            if (!validEnd){
                System.out.println("Website should end the .com or edu or .gov or .net");
            }
        }
        System.out.println("_____________");
        System.out.println(validEnd&& validEnd? "Valid website" : "invalid website");








    }
}
