package Shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("ender a radius");
        Input in2 = new Input();
        double userRad = in2.getDouble();
        Circle userCircle = new Circle(userRad);
        System.out.println("area: ");
        System.out.println(userCircle.getArea());
        System.out.println("circumference: ");
        System.out.println(userCircle.getCircumference());

    }
}