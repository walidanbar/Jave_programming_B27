package day14_string;

public class StringMethod1 {
    public static void main(String[] args) {



        String item = "pen"; // in string pool
        String item2 = new String("pen"); // directly in deep
        System.out.println(item == item2);

        String item3 = new String ("pen");
        System.out.println(item3 == item2); // compares the two objects. they are both in the heap
        // .equal(): compare the value of the Strings, which checks if the characters are the same
        System.out.println(item.equals(item2)); // checks the characters
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));

        System.out.println();
        System.out.println(item.equals("Pen")); // checks for exact characters including cases
        System.out.println(item.equalsIgnoreCase("Pen")); // check only for matching characters and ignores all the cases

        System.out.println("------------------------------------");
        String username = "jamesbond";
        String password = "BOND007";
        //System.out.println(username.equals("JAMESBOND"));
        System.out.println(username.equalsIgnoreCase("JAMESBOND"));
        System.out.println(password.equals("BOND007"));

        System.out.println("------------------------------------");

        String day = "Tuesday";
        System.out.println(day.length()); // counts how many charcter there is
        String day2 = "Friday";
        int len = day2.length();
        System.out.println(len);

        String str = " hello ";
        System.out.println(str.length()); // prints how many characters the String has, not the String
        // print(7)
        System.out.println(str);

        System.out.println("------------------------------------");
        String word =  "Summer";
        word.toUpperCase();// the uppercase method makes all the character uppercase, but we didn't do anything with this value
        // nextInt();
        System.out.println(word);
        System.out.println(word);
        word = word.toUpperCase(); // this time we make all the characters uppercase, then the String it gives us back(all uppercase), was reassigned into the variable
        System.out.println(word);
        System.out.println(word);
        System.out.println("------------------------------------");

        String sentence = "hello My NAME is";
        System.out.println(sentence.toLowerCase()); // make a new String that was all lowercase, and then printed it
        System.out.println(sentence); // print the original String, because String is immutable it cannot change
        String lowerVer = sentence.toLowerCase();
        // option3: reassign
        // sentence = sentence.toLowerCase();
        System.out.println("______________________________________");

        String s = "                    java         ";

        System.out.println(s.length());
        s = s.trim(); // trim method gets rid of all the extra s[aces in the beginning and end od a String
        System.out.println(s);
        System.out.println(s.length());
        String s2 = "   multiple words here   ";
        System.out.println(s2.trim()); //  trim() will remove from beginning and end, middle spaces will not be touched








    }
}
