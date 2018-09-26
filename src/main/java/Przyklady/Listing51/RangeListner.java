package Przyklady.Listing51;

public class RangeListner {

    // RangeListner


        int[] makeRange(int lower, int upper){
            int range[] = new int[(upper-lower) + 1];

            for(int i=0; i < range.length; i ++){
                range[i] = lower++;
            }
            return range;
        }

    }

