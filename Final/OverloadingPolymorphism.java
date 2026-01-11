package Final;

class ShapeCalculator {

    void calculateArea(double r) {
        double result = 3.1416 * r * r;
        System.out.printf("Area of Circle: %.2f\n", result);
    }

    void calculateArea(double length, double width) {
        double result = length * width;
        System.out.printf("Area of Rectangle: %.2f\n", result);
    }

    void calculateArea(int side) {
        int result = side * side;
        System.out.println("Area of Square: " + result);
    }
}

public class OverloadingPolymorphism {
    public static void main(String[] args) {
        ShapeCalculator calc = new ShapeCalculator();

        // Java picks the method based on WHAT you pass
        calc.calculateArea(5.0); // Calls Method 1 (Circle)
        calc.calculateArea(10.0, 5.0); // Calls Method 2 (Rectangle)
        calc.calculateArea(4); // Calls Method 3 (Square)
    }
}