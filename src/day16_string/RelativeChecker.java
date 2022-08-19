package day16_string;

public class RelativeChecker {
    public static void main(String[] args) {
String name1 = "James Bond";
String name2 = "Jamie Bond";

int indexOfSpace = name1.lastIndexOf(' ');
String lastname = name1.substring(indexOfSpace + 1); // so we don't take the space

if (name2.endsWith(lastname)){
    System.out.println("Related");
}else{
    System.out.println("Not Related");
}

        System.out.println(name2.endsWith(lastname)? "Related" : " Not Related");







    }
}