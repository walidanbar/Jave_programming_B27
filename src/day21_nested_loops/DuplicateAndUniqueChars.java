package day21_nested_loops;public class DuplicateAndUniqueChars {
    public static void main(String[] args) {

        String str = "AAABCCDEEF";
        String duplicate = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += ch;
            }
            if (count > 1) {
                if (duplicate.indexOf(ch) == -1) {
                    duplicate += ch;
                }
            }
        }
    }}