package day6_arithmetic_operators;

public class RelationalExamples {
    public static void main(String[] args) {

        System.out.println(3 > 2);
        System.out.println(5 < 10 );

        int a = 10;
        int b = 20;
        System.out.println(a < b); // 10< 20
        System.out.println(a < 15); // 10 < 15 -> true

        System.out.println(10 == 10);
        boolean isequal = 11 == 5;
        System.out.println(isequal);

        System.out.println(4 != 20);
        System.out.println(20 != 20);

        boolean x = !false;
        System.out.println(x);


    }
}
