package Przyklady;

public class Listing44str114 {

    //ArrayCopier

    public static void main(String[] args) {

        int[] array1 = {7,4,8,1,4,1,4};
        float[] array2 = new float[array1.length];

        System.out.print("array1: [");
        for(int i = 0; i < array1.length; i++){         // drukowana jest całą tablica z nawiasami [ i  ]
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");

        System.out.print("array2: [");
        int count = 0;
        while (count < array1.length && array1[count] != 1){ // array1[count] != 1 pomija w pierwszej tablicy numery 1
            array2[count] = (float)array1[count];
            System.out.print(array2[count++] + " ");
        }
        System.out.print("]");

    }
}
