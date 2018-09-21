package Przyklady;

public class Brudnopis {

    public static void main(String[] args) {

        float x = 0;
        float y = 5;
        int z = (int)(x /y);

        switch (z) {
            case 1:
                x = x + 2;
                break;
            case 2:
                x = x + 3;
                break;
                default:
                    x = x + 1;
                    break;
        }

        System.out.println( x);
    }
}
