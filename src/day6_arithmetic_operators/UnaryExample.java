package day6_arithmetic_operators;

public class UnaryExample {
    public static void main(String[] args) {

        int n = 0; //0
        n++; // post increment, value becomes 1
        System.out.println(n); //1
        ++n; // pre increment, value becomes 2
        System.out.println(n); //2
        System.out.println(++n); //
        // pre increment, value becomes3, then it prints the value

        System.out.println(++n); // pre increment, value becomes 4, then it prints the value
        System.out.println(n);

        System.out.println(n++); // post increment, prints the currrent value, which is 4, then it will increment by 1

        System.out.println(n);

        System.out.println("------------------------");

        int x = 4;
        int y = x;
        int z = ++x;
      //   y = x; inorder to change y too, we need to reassign it

        System.out.println("x = " + x); //4
        System.out.println("y = " + y); //4
        System.out.println("z = " + z); //5

        System.out.println("-------------------");

        int candy = 5;
        System.out.println(" Your kid asks for candy, you have " + candy);
        System.out.println("you give them, so now you have " + --candy); // pre decrement

        System.out.println("the sibling comes in and they want one, you check how many there then give them one" + candy--); // post decrement
        System.out.println("Total candy in jar now " + candy); // reference to the num after checking how many candies you have









    }
}
