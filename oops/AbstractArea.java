
package oops;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // Override area for rectangle
    double area() {
        System.out.println("This is Rectangle Area");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // Override area for triangle (corrected formula)
    double area() {
        System.out.println("This is Area of Triangle");
        return 0.5 * dim1 * dim2; 
    }
}

public class AbstractArea {
    public static void main(String args[]) {
        // Cannot instantiate abstract class Figure
        // Figure f = new Figure(10, 20);

        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figure;
        figure = r;
        System.out.println("Area is " + figure.area());

        figure = t;
        System.out.println("Area is " + figure.area());
    }
}



