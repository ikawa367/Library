public class Rectangle extends D2 {
    double x;
    double y;

    public void calPerimeter() {
        this.setPerimeter(2 * (x + y));
    }

    public void calSurface() {
        this.setSurface((x * y));
    }

    public void SetX(double input) {
        x = input;
    }

    public void SetY(double input) {
        y = input;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
