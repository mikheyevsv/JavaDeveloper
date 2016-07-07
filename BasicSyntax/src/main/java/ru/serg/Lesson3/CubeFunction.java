package ru.serg.Lesson3;

/**
 * Created by Serg on 24.02.2016.
 */
public class CubeFunction {
    private float a;
    private float b;
    private float c;
    float x1, x2;
    public CubeFunction(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float calculate(int x){
        float y = a * (x * x) + (b * x) + c;
           return y;
    }
}
