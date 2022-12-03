import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = null;
        Scanner sc = new Scanner(System.in);
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
                break;
            case "Square":
                // Add your input gathering and shape assignment here
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.print("Enter color: ");
                String col1 = sc.next();
                shape = new Rectangle.Square(side, col1);
                break;
            // Add other cases for other shapes here
            case "Ellipse":
                System.out.print("Enter a: ");
                double a1 = sc.nextDouble();
                System.out.print("Enter b: ");
                double b1 = sc.nextDouble();
                System.out.print("Enter color: ");
                String col2 = sc.next();
                shape = new Ellipse(col2, a1, b1);
                break;
            case "Circle":
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.print("Enter color: ");
                String col3 = sc.next();
                shape = new Ellipse.Circle(col3, r);
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
                System.out.print("Enter color: ");
                String col = sc.next();
                shape = new Triangle(col, b, h, a ,c);
                break;
            case "Equilateral Triangle":
                System.out.print("Enter side: ");
                double s1 = sc.nextDouble();
                System.out.print("Enter color: ");
                String col4 = sc.next();
                shape = new Triangle.EquilateralTriangle(col4, s1);
                break;

        }

        // This assert simply states that by the time the switch is done,
        // the shape should already be assigned to a particular shape
        // and is therefore not null anymore
        assert shape != null;
        System.out.println("\n" + shape);
        System.out.print("Area is ");
        System.out.format("%.2f", shape.area());
        System.out.print("\nPerimeter is ");
        System.out.format("%.2f", shape.perimeter());
    }
}