public class Parallelogram extends Shape implements Perimeter, Square {

    private float width;
    private float height;

    public Parallelogram(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void printName() {
        System.out.println("Parallelogram");
    }

    @Override
    public float shapePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public float shapeSquare() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Parallelogram perimeter = " + shapePerimeter() +
                ", Parallelogram square = " + shapeSquare();
    }
}
