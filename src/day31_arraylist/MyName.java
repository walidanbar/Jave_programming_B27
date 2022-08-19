package day31_arraylist;

import java.util.ArrayList;

public class MyName {
    /*
    Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element
     */
    public static void main(String[] args) {

        ArrayList<Character> myName = new ArrayList<>();

        myName.add('W');
        myName.add('a');
        myName.add('l');
        myName.add('i');
        myName.add('d');
        System.out.println(myName.get(0));
        System.out.println(myName.get(1));
        System.out.println(myName.get(2));
        System.out.println(myName.get(3));
        System.out.println(myName.get(4));




    }
}