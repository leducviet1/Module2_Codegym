package circleandcylinder;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2.0, "blue");
        System.out.println(c);

        Cylinder cy = new Cylinder(2.0, "green", 5.0);
        System.out.println(cy);
    }
}
