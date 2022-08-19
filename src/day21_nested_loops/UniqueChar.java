package day21_nested_loops;

public class UniqueChar {
    public static void main(String[] args) {

        String word = "aaaghsgtwjgggss";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            System.out.println("duplicate letter is " + word.charAt(i) + count);
            break;
        }


    }

}
