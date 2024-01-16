public class GravityCaslculator2 {

    public static void main (String[] arguments) {
        double a = -9.81; //Accelaration (m/s2)
        double t = 10; //Time(s)
        double vi = 0; //Initial Velocity (m/s)
        double xi = 0; //Initial position
        double x;


        x = (0.5 * (a * (t * t) + (vi * t) + (xi)));



        System.out.println("The correct value is " + x + " m ");
    }
}
