import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = null;
        Scanner sc = new Scanner(System.in);
        List<Shape> shapeslist = new ArrayList<Shape>();
        boolean test = true;
        do {
            System.out.print("Enter shape: ");
            String option = sc.nextLine();
            switch (option) {
                case "Rectangle":
                    System.out.print("Enter length: ");
                    double len = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double wid = sc.nextDouble();
                    // This nextLine is to rid the next line made by the previous scan
                    // Do this in the future as well, before getting a String input
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String color = sc.nextLine();
                    shape = new Rectangle(len, wid, color);
                    shapeslist.add(shape);
                    break;
                case "Square":
                    // Add your input gathering and shape assignment here
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter color: ");
                    String col1 = sc.next();
                    shape = new Rectangle.Square(side, col1);
                    shapeslist.add(shape);
                    sc.nextLine();
                    break;
                // Add other cases for other shapes here
                case "Ellipse":
                    System.out.print("Enter a: ");
                    double a1 = sc.nextDouble();
                    System.out.print("Enter b: ");
                    double b1 = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter color: ");
                    String col2 = sc.next();
                    shape = new Ellipse(col2, a1, b1);
                    shapeslist.add(shape);
                    sc.nextLine();
                    break;
                case "Circle":
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter color: ");
                    String col3 = sc.next();
                    shape = new Ellipse.Circle(col3, r);
                    shapeslist.add(shape);
                    sc.nextLine();
                    break;
                case "Triangle":
                    System.out.print("Enter base: ");
                    double b = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    System.out.print("Enter a: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter c: ");
                    double c = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter color: ");
                    String col = sc.next();
                    shape = new Triangle(col, b, h, a ,c);
                    shapeslist.add(shape);
                    sc.nextLine();
                    break;
                case "Equilateral Triangle":
                    System.out.print("Enter side: ");
                    double s1 = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter color: ");
                    String col4 = sc.next();
                    shape = new Triangle.EquilateralTriangle(col4, s1);
                    shapeslist.add(shape);
                    sc.nextLine();
                    break;
                case "DONE":
                    test = false;
                    break;
            }
        } while(test);
        do {
            System.out.print("Sort by: ");
            String op = sc.next();

            if (op.equals("Area")) {
                Collections.sort(shapeslist, new Shape.SortByArea());
                for (Shape s : shapeslist) {
                    System.out.printf("Area of A " + s + ": %.2f\n", s.area());
                }
            }

            if (op.equals("Perimeter")) {
                Collections.sort(shapeslist, new Shape.SortByPerimeter());
                for (Shape s : shapeslist) {
                    System.out.printf("Perimeter of A " + s + ": %.2f\n", s.perimeter());
                }
            }

            if (op.equals("Color")) {
                Collections.sort(shapeslist, new Shape.SortByColor());
                for (Shape s : shapeslist) {
                    System.out.printf("Area of A " + s + ": %.2f\n", s.area());
                }
            }
            if (op.equals("DONE"))
                break;
        } while(true);
    }
}