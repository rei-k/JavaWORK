public record Rectangle(double width, double height) implements Shape {
    public double area() { return width * height; }
    public double perimeter() { return 2 * (width + height); }
}
