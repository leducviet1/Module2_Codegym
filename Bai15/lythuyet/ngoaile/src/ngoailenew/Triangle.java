package ngoailenew;

public class Triangle {
    private double base;
    private double height;
    public Triangle(double base,double height){
        if(base <= 0 || height <= 0){
            throw new IllegalArgumentException("Base and height must > 0");
        }
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return base*height* 0.5;
    }
}
