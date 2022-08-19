package day31_arraylist;

import java.util.ArrayList;

public class RemoveVowels {
    /*Create an ArrayList of Characters
Fill the ArrayList with letters from a-z
Print the ArrayList of all the characters

Manually remove each vowels and print the new ArrayList
     */
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>();

        for (char i = 'a'; i <'z' ; i++) {
            letters.add(i);
        }

        System.out.println(letters);
        letters.remove((Character)'a');
        letters.remove((Character)'e');
        letters.remove((Character)'i');
        letters.remove((Character)'u');
        letters.remove((Character)'o');
        System.out.println(letters);




    }
}
