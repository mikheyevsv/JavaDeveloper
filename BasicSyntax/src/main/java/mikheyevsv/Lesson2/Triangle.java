package mikheyevsv.Lesson2;

/**
 * Created by Serg on 16.02.2016.
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public  Triangle( Point a, Point b, Point c ){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double area = -1;

    public double areaTriangle(){
        if(area == -1) {
            double AB = a.distanceTo(b);
            double BC = b.distanceTo(c);
            double AC = a.distanceTo(c);
            double p = (AB + BC + AC) / 2;
            area = Math.sqrt(p * (p-AB) * (p-BC) * (p-AC));
        }else if(area > 0) {
            System.out.println("Площадь заданного треугольника равна " + area);
        } else {
            System.out.println("Triangle not created");
        }
        return area;
    }
}


