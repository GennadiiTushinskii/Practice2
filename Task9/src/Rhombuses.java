public class Rhombuses extends Quadrangle implements Figure{
    double alpha, beta;

    public Rhombuses(int a, String color, double alpha, double beta) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getArea() {   //S = (d1*d2)/2
        double d1 = (a*(Math.sqrt(2-2*Math.cos(beta))));
        double d2 = (a*(Math.sqrt(2-2*Math.cos(alpha))));
        return (d1*d2)/2;
    }

    @Override
    public double getPerimeter() {
        return 2*a + 2*b;
    }

    @Override
    double getLargeDiagonal() {
        double d1 = (a*(Math.sqrt(2-2*Math.cos(beta))));
        double d2 = (a*(Math.sqrt(2-2*Math.cos(alpha))));
        return Math.max(d1,d2);
    }

    @Override
    double getHeight() {
        return a * Math.sin(alpha);
    }

    @Override
    String getColor() {
        return color;
    }
}
