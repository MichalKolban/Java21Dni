package Przyklady.Listing51;

public class Main {

    public static void main(String[] args) {

        int[] range;

        RangeListner rangeListner = new RangeListner();

        range = rangeListner.makeRange(4,13);
        System.out.print("Tablica : [");
        for(int i=0; i < range.length; i++){
            System.out.print(range[i] + " ");
        }
        System.out.print("]");
    }
}
