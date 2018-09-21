package Zad1str69;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {

        System.out.println("Enter the amount");

        Scanner scanner = new Scanner(System.in);

        double amount = scanner.nextDouble();

        System.out.println("Now im adding 40% of your amount");
        System.out.println("next im substract 1 500 fee");
        System.out.println("at the end I addin another 12% of your amount");

        double priceFinal = ((amount * 1.4) - 1500 ) * 1.12;

        System.out.println("Your final amount is: " + priceFinal);
    }
}
