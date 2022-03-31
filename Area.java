import java.util.Scanner;
import java.lang.Math;
// Calculate area of triangle, square & circle using function overloading. 
//Function parameter accept from user. Create Base Class Shape and Derived Classes Triangle,
// Square, Circle respectively. Implement getInputs() Method for accepting inputs, and Overload setArea() method for calculating area of respective shapes.
// Use Class Tester for creating objects.

abstract class Shape {
    double area;

    void setArea() {
    }

    void getInputs() {
    }
}

class Triangle extends Shape {
    double base, height;

    void setArea() {
        area = (base * height) / 2;
    }

    void getInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base - ");
        base = sc.nextDouble();
        System.out.print("Enter height - ");
        height = sc.nextDouble();
    }

}

class Circle extends Shape {
    double radius;

    void setArea() {
        area = Math.PI * (radius * radius);
    }

    void getInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius - ");
        radius = sc.nextDouble();
    }
}

class Square extends Shape {
    double side;

    void setArea() {
        area = side * side;
    }

    void getInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side - ");
        side = sc.nextDouble();
    }
}

class Area {
    public static void main(String[] args) {
        Triangle traingle = new Triangle();
        Circle circle = new Circle();
        Square sqaure = new Square();

        System.out.println("Traingle");
        traingle.getInputs();
        traingle.setArea();
        System.out.printf("Area is %f\n", traingle.area);

        System.out.println("Square");
        sqaure.getInputs();
        sqaure.setArea();
        System.out.printf("Area is %f\n", sqaure.area);

        System.out.println("Circle");
        circle.getInputs();
        circle.setArea();
        System.out.printf("Area is %f\n", circle.area);
    }
}