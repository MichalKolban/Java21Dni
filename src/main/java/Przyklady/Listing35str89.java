package Przyklady;

public class Listing35str89 {

    public static void main(String[] args) {

        String str1,str2;

        str1 = "Chłopie, ale to sie rozrasta";

        str2 = str1;

        System.out.println("String 1 " + str1);
        System.out.println("String 2 " + str2);
        System.out.println("Czy obiekty są takie same ?  " + (str1 == str2));

        str2 = new String(str1);

        System.out.println("String 1 " + str1);
        System.out.println("String 2 " + str2);
        System.out.println("Ten sam obiekt ? " + (str1 == str2));
        System.out.println("Ta sama wartość ? " + str1.equals(str2));

    }
}
