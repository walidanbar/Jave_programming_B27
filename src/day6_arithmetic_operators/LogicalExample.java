package day6_arithmetic_operators;

public class LogicalExample {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isGoodTemp = true;
        boolean doBbq = isWeekend && isGoodTemp;

        System.out.println("doBbq : " + doBbq);
        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFireFighter = false;
        boolean getDiscount = isTeacher || isPolice || isFireFighter;
        System.out.println("getDiscount :" + getDiscount);

        // goal: 5< number < 10
        int number = 8;
        System.out.println(number > 5 && number < 10); //
        System.out.println(number > 0 && number < 5);

        int age = 40;
        boolean invalidAge = age <0 || age> 120;









    }
}
