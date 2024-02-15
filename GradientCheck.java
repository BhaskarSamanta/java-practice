import java.util.Scanner;

class MyPoint {
    private int x;
    private int y;

    // Default constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get data from the user
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        this.x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        this.y = sc.nextInt();
    }

    // Method to calculate gradient of line segment
    public double lineSegment(MyPoint m, MyPoint n) {
        if (m.x == n.x) {
            System.out.println("Cannot calculate gradient, points lie on a vertical line.");
            return Double.POSITIVE_INFINITY; // vertical line
        }
        return (double) (n.y - m.y) / (n.x - m.x);
    }
}

public class GradientCheck {
    public static void main(String[] args) {
        // Test MyPoint class
        MyPoint point1 = new MyPoint(); // default constructor
        MyPoint point2 = new MyPoint(3, 4); // overloaded constructor

        point1.getData(); // Take input from user for point1
        point2.getData(); // Take input from user for point2

        double gradient = point1.lineSegment(point1, point2); // Calculate gradient
        System.out.println("Gradient of the line segment: " + gradient);
    }
}

