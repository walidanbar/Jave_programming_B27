package day03_variables;

public class DateTomorrow {
    public static void main(String[] args) {

        int month = 6;
        int day = 13;
        int year = 2033;
        /*
          OR int month, day, year; ----> then month = 6; day = 13; year = 2022;
         */
        System.out.println("Date: " + month +"/" + day + "/" + year);

        day = 14;

        System.out.println("Tomorrow's Date: " + month + "\\" + day +"/" + year);



    }
}
