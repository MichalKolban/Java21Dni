package Przyklady;

import java.util.StringTokenizer;

public class Listing31str72 {

    //StringToken

    public static void main(String[] args) {

        StringTokenizer st1,st2,myTxt1,myTxt2;

        String quote1 = "GOOG 530,80 -9,98";
        st1 = new StringTokenizer(quote1);
        System.out.println("Token 1 " + st1.nextToken());
        System.out.println("Token 2 " + st1.nextToken());
        System.out.println("Token 3 " + st1.nextToken());

        System.out.println("======================");

        String quote2 = "RTH@75,00@0,22";
        st2 = new StringTokenizer(quote2, "@");         // "@" w nawiasie jest znacznikiem który dzieli tekst
        System.out.println("Token 1 " + st2.nextToken());
        System.out.println("Token 2 " + st2.nextToken());
        System.out.println("token 3 " + st2.nextToken());

        System.out.println("======================");

        String text1 = "Hello my dog";
        myTxt1 = new StringTokenizer(text1);
        System.out.println("Token 1 " + myTxt1.nextToken());
        System.out.println("Token 2 " + myTxt1.nextToken());
        System.out.println("Token 3 " + myTxt1.nextToken());

        System.out.println("======================");

        String text2 = "Rise!THE!ALARM!Master!";
        myTxt2 = new StringTokenizer(text2,"!");        // tutaj separatorem jest wykrzyknik "!"
        System.out.println("Token 1 " + myTxt2.nextToken());
        System.out.println("Token 2 " + myTxt2.nextToken());
        System.out.println("Token 3 " + myTxt2.nextToken());
        System.out.println("Token 4 " + myTxt2.nextToken());

    }
}
