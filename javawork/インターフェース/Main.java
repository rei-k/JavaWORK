public class Main {
    public static void main(String[] args) {
        printShapeInfo(new Rectangle(5, 7));
        printShapeInfo(new Circle(4));
        printShapeInfo(new Triangle(6));
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println(shape.getClass().getSimpleName() + " area: " + shape.area() + ", perimeter: " + shape.perimeter());
    }
}
