package Przyklady.Listing52;

public class Main {

    public static void main(String[] args) {

        Passer paser = new Passer();

        paser.toUpperCase(args);

        for(int i = 0; i < args.length ; i++){
            System.out.print(args[i] + " ");
        }
    }
}
