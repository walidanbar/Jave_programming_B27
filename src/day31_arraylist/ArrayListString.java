package day31_arraylist;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        /*Create an ArrayList of Strings
        add these elements:
        add Hat
        add Shoes
        add Jacket in middle of Hat and Shoes
        add Towel in the beginning
        add Car between Towel and Hat
        Print the ArrayList after each action to see how the change is made
         */

           ArrayList<String> clothes = new ArrayList<>();
           clothes.add("Hat");
        clothes.add("Shoes");
        System.out.println(clothes);
        clothes.add(1,"Jacket");
        System.out.println(clothes);
        clothes.add(0,"Towel");
        clothes.add(1,"Car");
        System.out.println(clothes);










    }
}
