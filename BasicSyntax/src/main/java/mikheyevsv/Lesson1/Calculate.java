package mikheyevsv.Lesson1;

/**
 * Created by Serg on 08.02.2016.
 */
public class Calculate {
    private double result;

    public double add (double first, double second){
       return this.result = first + second;

    }

    public double sub (double first, double second){
        return this.result = first - second;
        
    }

    public double mult (double first, double second){
        return this.result = first * second;

    }

    public double div (double first, double second){
        return this.result = first / second;

    }
    public void result(){

        System.out.println(result);

    }

}
