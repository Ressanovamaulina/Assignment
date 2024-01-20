package MoreTypes_Methods_Conditionals;

public class SquareChange {
    public static void printSquare(int x){
        System.out.println("printSquare x = " + x);
        x = 10 * 10;
        System.out.println("printSquare x = " + x);
    }
    public static void main(String[] arguments){
        int x = 30;
        System.out.println("main x = " + x);
        printSquare(x);
        System.out.println("main x = " + x);
    }

}

