public class Cylinder extends D3 {
    private double radious;
    private double hight;

    public void calPerimeter() {
        this.setPerimeter(Math.PI * radious * 2 * hight);
    }

    public void calCapacity() {
        this.setCapacity((Math.PI * radious * radious * hight));
    }

    public void Setradious(double input) {
        radious = input;
    }

    public double getRadious() {
        return radious;
    }

    public void SetHight(double input) {
        hight = input;
    }

    public double getHight() {
        return hight;
    }
}
