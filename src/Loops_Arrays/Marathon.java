package Loops_Arrays;

public class Marathon {

    public static void main(String [] args)
    {
    String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phi", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
    };
    int[] times = {
            341, 273, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
    };
    int firstPlace = times[0];
    String firstName = names[0];
    int secondPlace = times[0];
    String secondName = names[0];

    for(int counter = 0; counter <times.length; counter++)

    {
        if (times[counter] < firstPlace) {
            firstPlace = times[counter];
            firstName = names[counter];
        }
    }
    for(int counter = 0; counter < times.length;counter++)

    {
        if (times[counter] > firstPlace)
            if (times[counter] < secondPlace){
            secondPlace = times[counter];
            secondName = names[counter]; }
    }
        System.out.printf("The fastest runner is : %s (%d minutes)%n", firstName, firstPlace);
        System.out.printf("The second fastest runner is : %s (%d Minutes)%n", secondName, secondPlace);

    }// end main

 }// end class lab
