package day23_array_loop;

public class EnterName {
    public static void main(String[] args) {

        /*

        print the name above using for loops
         */


        String str = "walid anbar";
                    //012345678910
        String reverse = "";

        for(int i = str. length() - 1; i >= 0; i--) {
            reverse +=  str.charAt(i);

        }

        System.out.println(str);
    }
}