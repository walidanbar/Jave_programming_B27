package day22_array;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {

String [] days = {"Monday" , "Tuesday", "Wednesday", "Thursday" , "Friday" , "Saturday" , "Sunday" };


Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the days");
int nums = input.nextInt();
if (nums >=1 || nums <=7 ){
    System.out.println("The days is " +  days[nums-1]);
}




    }
}
