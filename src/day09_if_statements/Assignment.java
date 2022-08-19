package day09_if_statements;

public class Assignment {
    public static void main(String[] args) {
        /*Create two number variables
Find and print which number is bigger between the two
	ex:
		50
		45
		output:
		50 is bigger
         */

        int num1 = 45;
        int num2 = 50;

        if (num1 > num2) {
            System.out.println(num1 + " is bigger");
        } else {
            System.out.println(num2 + " is bigger");
        }
        System.out.println("-------------------------");
        /*Create three number variables
        Find and print which number is bigger between the three
        ex:
        50
        45
        100
        output:100 is the biggest
         */
        int a = 50;
        int b = 45;
        int c = 100;

        if (a >b & a >c) {
            System.out.println(a + " is the biggest");
        } else if (b > a & b > c) {
            System.out.println(b + " is the biggest");
        }else{
            System.out.println(c + " is the biggest");

        }
        System.out.println("----------------");
        /*create an int value for the time of the day. Use a 24 hour format
        use the given time of day to display a messag
        hint: use seperate if statements
	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23 or 0 - 5, print: Good night
         */
        int timeOfTheDay = 8;

        if (timeOfTheDay >= 6 && timeOfTheDay <= 11)
        {
            System.out.println("Good Morning");}

        if (timeOfTheDay >= 12 && timeOfTheDay <= 16)
        {
            System.out.println("Good Evening");}

        if (timeOfTheDay >= 17 && timeOfTheDay <= 23 || timeOfTheDay >= 0 && timeOfTheDay <= 5)
        {
            System.out.println("Good Night");}

        System.out.println("------------------------");













    }
        }












