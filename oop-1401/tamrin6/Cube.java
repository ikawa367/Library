public class Cube extends D3 {
    private double side;

    public void calPerimeter() {
        this.setPerimeter(side * 4 * 6);
    }

    public void calCapacity() {
        this.setCapacity(side * side * side);
    }

    public void SetSide(double input) {
        side = input;
    }

    public double getSide() {
        return side;
    }
}
