package day18_loop;

public class EvenAndOdd {
    public static void main(String[] args) {

        int limit = 200;
        int count = 1;

        // printing all the even numbers:

        while(count <= limit){ // run for limit number of times. Go from 1 to limit

            if(count % 2 == 0){
                System.out.print(count + " ");
            }
            count++;
        }
        System.out.println();

        // print all the odd numbers from limit to 1, backwards order

        int back = limit; // starting number based on the limit variable

        while(back >= 1){

            if(back % 2 == 1){ // checks for odd != 0
                System.out.print(back + " ");
            }

            back--;
        }



    }
}