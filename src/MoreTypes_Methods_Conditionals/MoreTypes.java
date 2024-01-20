package MoreTypes_Methods_Conditionals;

public class MoreTypes {

    public static void main(String[] args){

        System.out.println("--------------Division-------------------");
        //Division
        double a = 5.0 / 2.0; // a = 2.5
        int b = 4 / 2; // b = 2
        int c = 5 / 2; // c = 2
        double d = 5 / 2; // d = 2.0

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        System.out.println("--------------Order of Operations-------------------");


        //Order of Operations
        double x = 3 / 2 + 1; // x = 2.0
        double y = 3 / (2 + 1); // y = 1.0

        System.out.println(x);
        System.out.println(y);

        System.out.println("--------------Conversion by casting-------------------");
        //Conversion by casting
        int ab = 2; // a = 2
        double cd = 2; // a = 2.0 (Implicit)

        //int ef = 18.7; //ERROR
        int gh = (int) 18.7; // a = 18

        double ij = 2/3; // a = 0.0
        double kl = (double) 2/3; // a = 0.6666…

        System.out.println(ab);
        System.out.println(cd);
        System.out.println(gh);
        System.out.println(ij);
        System.out.println(kl);


    }

}
