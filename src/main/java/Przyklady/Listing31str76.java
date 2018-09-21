package Przyklady;

import java.awt.*;

public class Listing31str76 {

    //nadpisywanie zmiennych

    public static void main(String[] args) {

        Point location = new Point(14,87);

        System.out.println("Położeniie początkowe :");
        System.out.println("X równe : " + location.x);
        System.out.println("Y równe : " + location.y);

        System.out.println("Zmiana położenia na x 76 y 120");

        location.x = 76;
        location.y = 120;

        System.out.println("Położenie końcowe :");
        System.out.println("X równe : " + location.x);
        System.out.println("Y równe : " + location.y);
    }
}
