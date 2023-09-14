public class Rectangle extends Quadrangle implements Figure{
    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(a*a + b*b);
    }

    @Override
    double getHeight() {
        return (a > b ? b : a);
    }

    @Override
    String getColor() {
        return color;
    }
}
