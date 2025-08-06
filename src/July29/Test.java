package July29;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Shape shape=new Circle(3);
        Shape shape1=new Rectangle(7);
        System.out.println("Area of Circle="+ shape.area());
        System.out.println("Area of Rectangle="+ shape1.area());
    }
}
class Shape{
    public double area(){
        return 0.0;
    }

}
class Circle extends Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }
}

class Rectangle extends Shape {
     double s;

    public Rectangle(double s) {
        this.s = s;
    }

    @Override
    public double area() {
        return s*s;
    }
}




