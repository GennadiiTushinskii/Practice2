public class Parallelogram extends Quadrangle implements Figure{
    double alpha, beta;

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    public double getLargeDiagonal(){
        return Math.sqrt(a*a + b*b -2*a*b*Math.cos(Math.toRadians(beta)));
    }

    @Override
    public String  getColor(){
        return color;
    }

    @Override
    double getHeight() {
        return ((a<b?a:b)*Math.sin(Math.toRadians(alpha)));
    }

    @Override
    public double area() {
        return a*b*Math.sin(Math.toRadians(alpha));
    }

    @Override
    public double perimeter() {
        return a*2 + b*2;
    }
}
