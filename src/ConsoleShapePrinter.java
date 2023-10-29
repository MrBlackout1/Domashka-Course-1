public class ConsoleShapePrinter implements iShapePrinter{
    @Override
    public void print(Shape s){
        System.out.println(s.getName());
    }
}
