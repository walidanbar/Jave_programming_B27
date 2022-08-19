package day16_string;

public class JohnSmith {
    public static void main(String[] args) {

        String firstName = "john";
        String lastName =  "smith";

        String id = firstName.substring(0,1)+ lastName.substring(0,1).toUpperCase()+lastName.substring(1,3)+ (firstName.length()*2);;

        System.out.println("ID : " + id);







    }
}
