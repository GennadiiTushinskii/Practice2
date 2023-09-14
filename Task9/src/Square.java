public class Square extends Quadrangle implements Figure{
    public Square(int a, String color) {
        super(a, a, color);
    }

    public double getArea() {
        return a*b;
    }

    public double getPerimeter() {
        return 2*a+2*b;
    }

    @Override
    double getLargeDiagonal() {
        return a*Math.sqrt(2);
    }

    @Override
    double getHeight() {
        return a;
    }

    @Override
    String getColor() {
        return color;
    }
}
