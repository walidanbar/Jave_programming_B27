package day5_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 14;
        int i = (int) b;  // int is bigger, so this is okay

        long l = 40; // by default 40 is int type, int can automatically be stored into long int is smaller than long
        long l2 = 300000000L; //




        short s = 60;
        double d3 = s; // automatic: 60.0

        float f2 = (float)100.50; // or float f2 = 100.50f;
        long l3 = (long) f2;
        System.out.println(l3);

        double d4 = l3;
        System.out.println(d4);





    }
}
