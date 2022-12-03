public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public  Rectangle(String color) {
        super(color);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + " which is also a Rectangle";
    }

    public static class Square extends Rectangle {
        double side;

        public Square(double side, String color) {
            // TODO call super()
            super(color);
            this.side = side;
        }

        public double area() {
            return Math.pow(side, 2);
        }

        public double perimeter() {
            return 4 * side;
        }

        public String toString() {
            return super.toString() + " which is also a Square";
        }

    }
}