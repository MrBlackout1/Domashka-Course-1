public class Test{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Pentagon pentagon = new Pentagon();
        Quad quad = new Quad();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        iShapePrinter sp = new ConsoleShapePrinter();
        sp.print(circle);
        sp.print(pentagon);
        sp.print(quad);
        sp.print(rectangle);
        sp.print(triangle);
    }
}