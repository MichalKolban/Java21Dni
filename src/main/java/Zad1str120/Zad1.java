package Zad1str120;

public class Zad1 {

    //DayCounter

    public static void main(String[] args) {

        int yearIn = 2016;
        int monthIn = 1;
        if(args.length > 0)
            monthIn = Integer.parseInt(args[0]);
        if(args.length > 1)
            yearIn = Integer.parseInt(args[1]);
        System.out.println(monthIn + "/" + yearIn + " ma " + countDays(monthIn, yearIn) + " dni");


        System.out.println("==========");

        int countYear = 0;

        for(countYear = 0; countYear < 12; countYear++) {
            System.out.println();

        }
    }

    static int countDays(int month, int year){
        int count = -1;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 2:
                if(year % 4 == 0)
                    count = 29;
                else
                    count = 28;
                if((year % 100 == 0) & (year % 400 != 0))
                    count = 28;
        }
        return count;
    }
}
