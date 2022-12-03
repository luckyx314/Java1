import java.util.*;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "shape that is color " + color;
    }

    public abstract double area();
    public abstract double perimeter();


    public static class SortByArea implements Comparator<Shape> {

        @Override
        public int compare(Shape o1, Shape o2) {
            if (o1.area() < o2.area()) {
                return 1;
            }
            if (o1.area() == o2.area()) {
                return 0;
            }

            return -1;
        }
    }

    public static class SortByPerimeter implements Comparator<Shape> {
        @Override
        public int compare(Shape o1, Shape o2) {
            if (o1.perimeter() < o2.perimeter()) {
                return 1;
            }
            if (o1.perimeter() == o2.perimeter()) {
                return 0;
            }
            return -1;
        }
    }

    public static class SortByColor implements Comparator<Shape> {
        @Override
        public int compare(Shape o1, Shape o2) {
            int res = o1.color.compareTo(o2.color);
            if (res == 0) {
                if (o1.area() < o2.area()) {
                    return 1;
                }
                if (o1.area() == o2.area()) {
                    return 0;
                }
                return -1;
            } else {
                return res;
            }
        }
    }


}