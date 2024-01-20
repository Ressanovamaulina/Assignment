package Loops_Arrays;

public class Marathon2 {
    public static void main(String[] arguments) {
        String[] names
                = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
                "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 70, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + ":" + times[i]);
        }
        int f = findTheFastest(times);
        int sf = find2fastest(times);

        System.out.println("The fastest is " + names[f] + " with " + times[f] + " minutes ");
        System.out.println("The second fastest is " + names[sf] + " with " + times[sf] + " minutes ");

    }


    private static int find2fastest(int[] times){
        int f = findTheFastest(times);
        int sf = (f != 0) ? 0 : 1;
        for (int i = sf + 1; i < times.length; i++){
            if (times[i] < times[sf] && i != f)
                sf = i;
        }
        return sf;
    }
    private static int findTheFastest(int[] times){
        int minIn = 0;
        for (int i = 1; i < times.length; i++){
            if(times[i] < times[minIn])
                minIn = i;
            }
            return minIn;
        }
    }

