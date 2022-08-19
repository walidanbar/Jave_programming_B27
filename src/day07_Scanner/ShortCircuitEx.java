package day07_Scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {

        System.out.println(true&&true);
        System.out.println(false&& true);
        // System.out.println(5/0); you cannot divide by 0
        // || or && mean that the code's not going to run for second part if the 1st part determinate the result
        // one & or | means the code's going to run.

        //System.out.println(true && 5/0 == 0);

        int count =0;
        System.out.println(true || count++ ==1);

        System.out.println(count);




    }
}

