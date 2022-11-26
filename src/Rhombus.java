public class Rhombus extends Shape implements Perimeter, Square{

    private float sideA;
    private float sideB;
    @Override
    public void printName() {
        System.out.println("Rhombus");
    }

    public Rhombus(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public float shapePerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public float shapeSquare() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Parallelogram perimeter = " + shapePerimeter() +
                ", Parallelogram square = " + shapeSquare();
    }
}
