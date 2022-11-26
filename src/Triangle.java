public class Triangle extends Shape implements Perimeter, Square{
    private float sideA;
    private float sideB;
    private float sideC;

    @Override
    public void printName() {
        System.out.println("Triangle");
    }

    public Triangle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public float shapePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public float shapeSquare() {
        return 0.5F * sideA * sideB;
    }

    @Override
    public String toString() {
        return "Triangle perimeter = " + shapePerimeter() +
                ", Triangle square = " + shapeSquare();
    }
}
