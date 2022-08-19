package day24_array;

import java.util.Arrays;

public class ReverseSentance {
    public static void main(String[] args) {
        String str = " Today is friday. Have a good weekend";
        // reverse: weekend! good a Have Friday. is Today

        String [] word =  str.split(" ");
        System.out.println(Arrays.toString(word));
        String reverse = "";

        for (int i = word.length- 1; i >=0 ; i--) {
            reverse += word[i]+" ";

        }

        System.out.println(reverse.trim());


    }
}
