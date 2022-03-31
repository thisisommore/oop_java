import java.util.Scanner;
// Calculate area of triangle, square & circle using function overloading. 
//Function parameter accept from user. Create Base Class Shape and Derived Classes Triangle,
// Square, Circle respectively. Implement getInputs() Method for accepting inputs, and Overload setArea() method for calculating area of respective shapes.
// Use Class Tester for creating objects.

abstract class Shape {
    double area;

    void getInputs() {
    }

    // Triangle
    static public double setArea(double height, double base) {
        return (base * height) / 2;
    }

    // Circle
    static public double setArea(double radius, float pi) {
        return pi * (radius * radius);
    }

    // Square
    static public double setArea(double side) {
        return side * side;
    }
}

class Triangle extends Shape {
    double base, height;

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

    void getInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius - ");
        radius = sc.nextDouble();
    }
}

class Square extends Shape {
    double side;

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
        traingle.area = Shape.setArea(traingle.height, traingle.base);
        System.out.printf("Area is %f\n", traingle.area);

        System.out.println("Square");
        sqaure.getInputs();
        sqaure.area = Shape.setArea(sqaure.side);
        System.out.printf("Area is %f\n", sqaure.area);

        System.out.println("Circle");
        circle.getInputs();
        circle.area = Shape.setArea(circle.radius, 3.14f);
        System.out.printf("Area is %f\n", circle.area);
    }
}