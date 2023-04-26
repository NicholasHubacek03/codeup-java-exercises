
package Shapes;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(Math.PI * this.radius, 2);
    }
    public double getCircumference() {
        return Math.PI * this.radius * 2;
    }
}
