public class Rectangle extends Shape implements Perimeter, Square{

    private float width;
    private float height;
    @Override
    public void printName() {
        System.out.println("Rectangle");
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float shapePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public float shapeSquare() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Parallelogram perimeter = " + shapePerimeter() +
                ", Parallelogram square = " + shapeSquare();
    }
}
