package Shapes;

public class Square extends Rectangle{
    public double side;

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    public double getPerimeter(){
        return side*4;
    }

    public double getArea(){
        return Math.pow(side, 2);
    }

}
