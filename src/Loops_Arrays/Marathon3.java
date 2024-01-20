package Loops_Arrays;



public class Marathon3 {


    public static int getMinIndex(int[] values) {

        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < values.length; i++)
            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }

        return minIndex;
    }

}

