package boom;

public class Rectangle extends shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
}

    @Override
    public void calculateArea() {
        area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
