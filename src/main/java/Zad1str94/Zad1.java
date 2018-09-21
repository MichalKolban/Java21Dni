package Zad1str94;

import java.util.StringTokenizer;

public class Zad1 {

    public static void main(String[] args) {

        StringTokenizer date;

        String quote1 = "29/04/2016";
        date = new StringTokenizer(quote1,"/");
        System.out.println("Token 1 Day   : " + date.nextToken());
        System.out.println("Token 2 Month : " + date.nextToken());
        System.out.println("Token 3 Year  : " + date.nextToken());
    }

}
