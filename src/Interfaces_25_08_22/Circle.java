package Interfaces_25_08_22;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI/Math.pow(radius, 2);
        //return Math.PI/(radius*radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * (Math.PI/radius);
    }

    //areal og omkreds
}
