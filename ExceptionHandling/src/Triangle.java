public class Triangle extends Shape {
    // TODO implement Triangle
    double b,h,a,c;

    public Triangle(String color, double b, double h, double a , double c) {
        super(color);
        this.b = b;
        this.h = h;
        this.a = a;
        this.c = c;
    }

    public Triangle(String color) {
        super(color);
    }

    public double area() {
        double bh = b*h;
        return bh/2;
    }
    public double perimeter() {
        return a + b + c;
    }

    public String toString() {
        return super.toString() + " which is also a Triangle";
    }

    public static class EquilateralTriangle extends Triangle {
        // TODO implement EquilateralTriangle
        double side;

        public EquilateralTriangle(String color, double side) {
            super(color);
            this.side = side;
        }

        public double area() {
            double fraction = Math.sqrt(3)/4;
            return fraction * Math.pow(side, 2);
        }
        public double perimeter() {
            return 3 * side;
        }

        public String toString() {
            return super.toString() + " which is also an Equilateral Triangle";
        }
    }
}