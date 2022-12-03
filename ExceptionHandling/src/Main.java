import java.util.Scanner;

class MustBeANumber extends Exception {
    @Override
    public String getMessage() {
        return "Input must be a number";
    }
}

class NotZero extends Exception {
    public String getMessage() {
        return "Input must be nonzero";
    }
}

class NotNegative extends Exception {
    public String getMessage() {
        return "Input must not be a negative number";
    }
}

class UnknownShape extends Exception {
    public String getMessage() {
        return "Unknown shape";
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape: ");
        String option = sc.nextLine();
        switch (option) {
            case "Rectangle":
                try {
                    System.out.print("Enter length: ");
                    double len = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double wid = sc.nextDouble();
                    // This nextLine is to rid the next line made by the previous scan
                    // Do this in the future as well, before getting a String input
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String color = sc.nextLine();
                    if (len == 0 || wid == 0)
                        throw new NotZero();
                    if (wid < 0 || len < 0)
                        throw new NotNegative();
                    shape = new Rectangle(len, wid, color);
                }  catch (NotZero | NotNegative e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "Square":
                // Add your input gathering and shape assignment here
                System.out.print("Enter side: ");
                try {
                    double side = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String col1 = sc.next();
                    if (side == 0)
                        throw new NotZero();
                    if (side < 0)
                        throw new NotNegative();
                    shape = new Rectangle.Square(side, col1);
                } catch (NotZero | NotNegative e) {
                    System.out.println(e.getMessage());
                }
                sc.nextLine();
                break;
            // Add other cases for other shapes here
            case "Ellipse":
                try {
                    System.out.print("Enter a: ");
                    double a1 = sc.nextDouble();
                    System.out.print("Enter b: ");
                    double b1 = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter color: ");
                    String col2 = sc.next();
                    if (a1 == 0 || b1 == 0)
                        throw new NotZero();
                    if (a1 < 0 || b1 < 0)
                        throw new NotNegative();
                    shape = new Ellipse(col2, a1, b1);
                    sc.nextLine();
                } catch (NotZero | NotNegative e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "Circle":
                try {
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter color: ");
                    String col3 = sc.next();
                    if (r == 0)
                        throw new NotZero();
                    if (r < 0)
                        throw new NotNegative();
                    shape = new Ellipse.Circle(col3, r);
                    sc.nextLine();
                } catch (NotZero | NotNegative e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "Triangle":
                try {
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

                    if (b < 0 || h < 0 || a < 0 || c < 0)
                        throw new NotNegative();
                    if (b == 0 || h == 0 || a == 0 || c == 0)
                        throw new NotZero();

                    shape = new Triangle(col, b, h, a ,c);

                } catch (NotNegative | NotZero e) {
                    System.out.println(e.getMessage());
                }
                sc.nextLine();
                break;
            case "Equilateral Triangle":
                try {
                    System.out.print("Enter side: ");
                    double s1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String col4 = sc.next();
                    if (s1 == 0)
                        throw new NotZero();
                    if (s1 < 0)
                        throw new NotNegative();
                    shape = new Triangle.EquilateralTriangle(col4, s1);
                    sc.nextLine();
                } catch (NotNegative | NotZero e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Unknown shape");

        }

        // This assert simply states that by the time the switch is done,
        // the shape should already be assigned to a particular shape
        // and is therefore not null anymore
        if (shape != null) {
//            assert shape != null;
            System.out.println("\n" + shape);
            System.out.print("Area is ");
            System.out.format("%.2f", shape.area());
            System.out.print("\nPerimeter is ");
            System.out.format("%.2f", shape.perimeter());
        }
    }
}