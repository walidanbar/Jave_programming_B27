package day6_arithmetic_operators;

public class GiftCard {
    public static void main(String[] args) {
        /* declare and assign a gift card variable at 500
        declare and assign times used at 3
        print using giftcard and subtract 150 from the amount
        reduce the times used by one
        print using giftcard and subtract 99 from the amount
        reduce the time used by one
        print information at the end */

        int giftCardValue = 500;
        int usageTimes = 3;

        giftCardValue -= 150;

        System.out.println("usageTimes : " + --usageTimes + "\ngiftCardValue : " + giftCardValue);

        giftCardValue -= 99;

        System.out.println("usageTimes : " + --usageTimes + "\ngiftCardValue : " + giftCardValue);

// ____________________________________
        /*
       int a = 8;
       int b = a--;
        //
        //what is a? 7
        //what is b? 8
                */
        int a = 8;
        int b = a--;
        System.out.println(a);
        System.out.println(b);












    }
}
