package day10_if_statements;

public class SalesBonus {
    public static void main(String[] args) {

        int sales = 10000;
        int bonus = 0;

        if (sales >=10000 && sales < 15000){
            bonus = 5000;
        }

        if (sales >= 15000){
            bonus = 70000;
        }
        System.out.println("Sales: " + sales);
        System.out.println("Bonus: " + bonus);
















    }


}
