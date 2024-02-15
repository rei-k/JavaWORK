public record Triangle(double side) implements Shape {
    public double area() { return (Math.sqrt(3) / 4) * side * side; }
    public double perimeter() { return 3 * side; }
}
