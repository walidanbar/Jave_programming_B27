package day07_Scanner;

public class UpdateVariable {
    public static void main(String[] args) {

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
                 b = --a;
        System.out.println("b = " + b);

    }
}
