package Przyklady;

import java.awt.*;

public class Listing34str82 {

    public static void main(String[] args) {

        Point pt1, pt2;
        pt1 = new Point(100,100); // Oba pointy będą miały takie same wartości ponieważ odnoszą się do tego samego miejsca, aby miały różne należałoby zrobic pt2 = new Point();
        pt2 = pt1;

        pt1.x = 200;
        pt1.y = 200;

        System.out.println("Point 1 : " + pt1.x + " " + pt1.y);
        System.out.println("Point 2 : " + pt2.x + " " + pt2.y);

    }
}
