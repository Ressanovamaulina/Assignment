package MoreTypes_Methods_Conditionals;

public class WeeklyPay{
    //Foo Corporation needs a program to calculate
    //how much to pay their employees.

    //1. Pay = hours worked x base pay
    //2. Hours over 40 get paid 1.5 the base pay.
    //3. The base pay must be no less than $8.00.
    //4. The number of hours must be no more than 60.

    public static void pay (double basePay, int hours){
        if (basePay < 8.0){ //The base pay must be no less than $8.00
            System.out.println("You must be paid at least $8.00/hour");
        } else if (hours > 60){ //The number of hours must be no more than 60
            System.out.println("You can't work more than 60 hours a week");
        } else {
            int overtimeHours = 0;
            if (hours > 40){ // Hours over 40 get paid 1.5 the base pay
                overtimeHours = hours - 40;
                hours = 40;
            }
            double pay = basePay * hours; //Pay = hours worked x base pay
            pay += overtimeHours * basePay * 1.5; // Hours over 40 get paid 1.5 the base pay
            System.out.println("Pay this employee $" + pay);
        }
    }
    public static void main(String[] arguments){
        System.out.println("Employee 1 : ");

        pay(7.5,35);

        System.out.println("Employee 2 : ");
        pay(8.2, 47);

        System.out.println("Employee 3 : ");
        pay(10.0, 73);
    }

}
