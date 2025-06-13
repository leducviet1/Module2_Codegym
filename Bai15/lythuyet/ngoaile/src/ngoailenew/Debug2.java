package ngoailenew;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Debug2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do{
            System.out.println("Menu area calculation");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("0. Exit");
            try{
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Height:");
                        double length = sc.nextDouble();
                        System.out.println("Width:");
                        double width = sc.nextDouble();
                        Rectangle rectangle = new Rectangle(length,width);
                        System.out.println("Dien tich: " + rectangle.getArea());
                        break;
                    case 2:
                        System.out.println("Base:");
                        double base = sc.nextDouble();
                        System.out.println("Height:");
                        double height = sc.nextDouble();
                        Triangle triangle = new Triangle(base , height);
                        System.out.println("Area :" + triangle.getArea());
                        break;
                    case 3:
                        System.out.println("Radius:");
                        double radius = sc.nextDouble();
                        Circle circle = new Circle(radius);
                        System.out.println("Area: " + circle.getArea());
                        break;
                    case 0:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Your choice is not valid");
                }
            }catch (IllegalArgumentException e) {
                System.out.println("Loi:" + e.getMessage());
            }catch (InputMismatchException e){
                System.out.println("Nhập sai kiểu dữ liệu");
            }
        }while (choice != 0);

        sc.close();
    }
}
