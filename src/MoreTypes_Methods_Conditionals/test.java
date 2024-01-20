package MoreTypes_Methods_Conditionals;

public class test {

    public static void salaryCalculation(int x){
        if (x < 5){
            System.out.println(" Your total salary is " + x);
        }
    }
    public static void main(String[] arguments){
        salaryCalculation(1);
        salaryCalculation(2);
        salaryCalculation(3);
    }

}
