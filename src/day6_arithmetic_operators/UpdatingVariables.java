package day6_arithmetic_operators;

public class UpdatingVariables {
    public static void main(String[] args) {
        int n = 10;

        // reassign a new value
        n = 20;

        int a = 3;
        a = a + 4; // a+4  --> 3 + 4 += 7 gets stores as the new value for a

        int b = 15;
        b += 9; // b = b + 9;

        int z = 10;
        /*
        updating a number by 1:
        z = 11;
        or
        z = z +1;
        or z +=1;
        or z++ or ++z
         */
        System.out.println();
         int java = 8;
         int testing = --java; // pre decrement

        System.out.println(java);  // pre 8 --> 7
        System.out.println(testing); // 7

        int x = 7;
        int y = x--;

        System.out.println(x); //7-->6
        System.out.println(y);














    }
}
