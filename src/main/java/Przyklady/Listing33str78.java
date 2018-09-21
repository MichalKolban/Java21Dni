package Przyklady;

public class Listing33str78 {

    // StringChecker

    public static void main(String[] args) {

        String str = "Lannister zawsze spłaca swoje długi.";
        System.out.println("Tekst to  : " + str);

        System.out.println("Długośc tekstu to : " + str.length());

        System.out.println("Znak na pozycji 6 to: " + str.charAt(6));

        System.out.println("Fragment tekstu od znaku 17 do 23to : " + str.substring(17,23));

        System.out.println("Indeks pierwszej litery 't' to: " + str.indexOf('t'));

        System.out.println("Indeks początku słowa 'długi' to : " + str.indexOf("długi"));

        System.out.println("Teskt zapisany wielkimi literami : " + str.toUpperCase());

        System.out.println("Tekst zapisany małymi literami : " + str.toLowerCase());
    }
}
