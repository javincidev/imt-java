package Class;


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
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}
public class FindAreas {
    public static void main(String[] args) {
//        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure fingref;

        fingref = r;
        System.out.println("Площад равна " + fingref.area());

        fingref = t;
        System.out.println("Площад равна " + fingref.area());

       /* fingref = f;
        System.out.println("Площад равна " + fingref.area());*/
    }
}
