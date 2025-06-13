package ngoailenew;

public class Circle {
    private double radius;
    public Circle(double radius){
        if (radius <= 0 || radius >=100){
            throw new IllegalArgumentException("Ban kinh khong hop le");
        }
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
