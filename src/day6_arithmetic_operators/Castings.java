package day6_arithmetic_operators;

public class Castings {
    public static void main(String[] args) {
        // 1.1 declare a variable of float named averageScore and initialize it to 20.5
       //  1.2 declare the following variables and assign averageScore to each of them:

        float averageScore = 20.5f;
        byte num1= (byte) averageScore;
        short num2 = (short) averageScore;
        int num3 = (int) averageScore;
        long num4 = (long) averageScore;
        float num5 = averageScore;
        double num6 = averageScore;

        System.out.println("averageScore = " + averageScore + "\nnum1 = " +  num1 + "\nnum6 = " + num6 );




    }
}
