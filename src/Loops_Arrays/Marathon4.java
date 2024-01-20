package Loops_Arrays;

import static Loops_Arrays.Marathon3.getMinIndex;

public class Marathon4 {

    public static int getSecondMinIndex(int[] values) {
        int secondIdx = -1;
        int minIdx= getMinIndex(values);
        for(int i=0; i<values.length; i++) {
            if (i == minIdx)
                continue;
            if (secondIdx == -1 ||
                    values[i] < values[secondIdx])
                secondIdx = i;

        }

        return secondIdx;

    }

}
