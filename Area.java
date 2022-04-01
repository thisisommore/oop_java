import java.util.Scanner;
// Calculate area of triangle, square & circle using function overloading. 
//Function parameter accept from user. Create Base Class Shape and Derived Classes Triangle,
// Square, Circle respectively. Implement getInputs() Method for accepting inputs, and Overload setArea() method for calculating area of respective shapes.
// Use Class Tester for creating objects.

abstract class Shape {
    double area;

    // Triangle
    static public void setArea(Triangle t) {
        t.area =  (t.base * t.height) / 2;
    }

    // Circle
    static public void setArea(Circle c) {
        c.area= Math.PI * (c.radius * c.radius);
    }

    // Square
    static public void setArea(Square sq) {
        sq.area= sq.side * sq.side;
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
        Shape.setArea(traingle);
        System.out.printf("Area is %f\n", traingle.area);

        System.out.println("Square");
        sqaure.getInputs();
        Shape.setArea(sqaure);
        System.out.printf("Area is %f\n", sqaure.area);

        System.out.println("Circle");
        circle.getInputs();
        Shape.setArea(circle);
        System.out.printf("Area is %f\n", circle.area);
    }
}