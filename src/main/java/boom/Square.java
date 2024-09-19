package boom;

public class Square extends shape {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void calculateArea() {
        area = side * side;
        System.out.println("Area of the square: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * side;
        System.out.println("Perimeter of the square: " + perimeter);

    }
}
