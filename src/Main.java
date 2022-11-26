public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(12);
        circle.printName();
        System.out.println(circle);

        Shape parallelogram = new Parallelogram(2, 3);
        parallelogram.printName();
        System.out.println(parallelogram);

        Shape rectangle = new Rectangle(2.3F, 3.5F);
        rectangle.printName();
        System.out.println(rectangle);

        Shape rhombus = new Rhombus(4.3F, 5.2F);
        rhombus.printName();
        System.out.println(rhombus);

        Shape triangle = new Triangle(2, 5, 2);
        triangle.printName();
        System.out.println(triangle);
    }
}