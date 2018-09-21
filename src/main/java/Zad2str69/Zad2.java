package Zad2str69;

import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value");

        float number1 = scanner.nextFloat();

        System.out.println("Enter second value");

        float number2 = scanner.nextFloat();

        float firstDivide = number1 / number2;

        float firstModulo = number1 % number2;

        System.out.println("\t value of " + number1 + " divide by " + number2 + " is " + firstDivide);

        System.out.println("\t ==================");

        System.out.println("\t value of " + number1 + " modulo of " + number2 + " is " + firstModulo);
    }
}
