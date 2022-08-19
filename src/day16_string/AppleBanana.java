package day16_string;

public class AppleBanana {
    public static void main(String[] args) {

       /* Given two words. Print the first word without its first character then print the second word without its last character.

                Input:
        apple
                banana
        Output:
        pple
                banan
                        */
        String f1 = "apple";
        String f2 = "banana";
        System.out.println(f1.substring(1));
        System.out.println(f2.substring(0,5));





    }
}
