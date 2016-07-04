package mikheyevsv.Lesson1;

/**
 * Created by Serg on 08.02.2016.
 */
public class CalcInit {
    public static void main (String[] args){

        Calculate calc = new Calculate();

        calc.add(2d, 3d);
        calc.result();
        calc.sub(4d, 2d);
        calc.result();
        calc.mult(3d, 2d);
        calc.result();
        calc.div(8d, 2d);
        calc.result();


    }
}
