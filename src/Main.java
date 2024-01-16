public class Main {
    public static void main(String[] args) {

        String foo = "IAP 6.092";
        System.out.println(foo);
        foo = "Something Else";
        System.out.println(foo);

        double score = 1.0 + 2.0 + 3.0;
        System.out.println(score);
        score = score / 2.0;
        System.out.println(score);

        double scoree = 1.0 + 2.0 * 3.0;
        System.out.println(scoree);

        double copy = scoree;
        copy = copy / 2.0;

        System.out.println(copy);
        System.out.println(scoree);
    }
}