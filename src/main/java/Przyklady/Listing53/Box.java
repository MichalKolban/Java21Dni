package Przyklady.Listing53;

import java.awt.*;
import java.sql.SQLOutput;

public class Box {

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Box buildBox(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        return this;
    }

    Box buildBox(Point topLeft, Point buttomRight){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = buttomRight.x;
        y2 = buttomRight.y;
        return this;
    }

    Box buildBox(Point topLeft, int w, int h){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
        return this;
    }
    void printBox(){
        System.out.print("Box : <" + x1 + "," + y1);
        System.out.println(", " + x2 + "," + y2 + " >");
    }

    public static void main(String[] args) {

        Box rectangle = new Box();

        System.out.println("Współrzedne buildBox ze wspolrzednymi (25,25) i (50,50)");
        rectangle.buildBox(25,25,50,50);
        rectangle.printBox();

        System.out.println("buildBox z punktami (10,10) i (20,20)");
        rectangle.buildBox(new Point(10,10), new Point(20,20));
        rectangle.printBox();

        System.out.println("buildbox z punktem (10,10) szerokoscia 50 i wysokoscią 50 ");
        rectangle.buildBox(new Point(10,10), 50,50);
        rectangle.printBox();

    }
}
