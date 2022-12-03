public class Ellipse extends Shape {
    // TODO implement Ellipse
    double a,b;
    final double pi = Math.PI;

    public Ellipse(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public Ellipse(String color) {
        super(color);
    }

    public double area() {
        return pi * a * b;
    }

    public double perimeter() {
        double n1 = 3 * (a+b);
        double n2 = (a + (3 * b)) * (b + (3 * a));
        double pi = Math.PI;
        return pi * (n1 - Math.sqrt(n2));
    }

    public String toString() {
        return super.toString() + " which is also an Ellipse";
    }


    public static class Circle extends Ellipse {
        // TODO implement Circle
        double r;
        double pi = Math.PI;

        public Circle(String color, double r) {
            super(color);
            this.r = r;
        }

        public double area() {
            return pi * Math.pow(r,2);
        }

        public double perimeter() {
            return 2 * pi * r;
        }

        public String toString() {
            return super.toString() + " which is also a Circle";
        }
    }
}