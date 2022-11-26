public class Circle extends Shape implements Perimeter, Square {
    private float radius;
    public static final float PI = 3.14F;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void printName() {
        System.out.println("Circle");
    }

    @Override
    public float shapePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public float shapeSquare() {
        return PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle perimeter = " + shapePerimeter() +
                ", Circle square = " + shapeSquare();
    }
}
