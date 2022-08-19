package day31_arraylist;

import java.util.ArrayList;

public class Avengers {
    /*
    Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye
    remove Thor by index
    remove Iron Man by element
    remove the first index
Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add( "Thor");
        avengers.add("Captain America");
        avengers.add("Hawkeye");

        avengers.remove(2);
        avengers.remove("Iron Man");
        avengers.remove(0);
        System.out.println(avengers);





    }
}