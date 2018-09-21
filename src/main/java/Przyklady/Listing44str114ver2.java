package Przyklady;

public class Listing44str114ver2 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,34,32,22222,56789};

        double[] numbersFlo = new double[numbers.length];

        System.out.print("First numbers :");

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Numbers parse to double : ");
        int count = 0;

        while (count < numbers.length){
            numbersFlo[count] = (double) numbers[count];
        System.out.print(numbersFlo[count++] + " " );
    }

    }
}
