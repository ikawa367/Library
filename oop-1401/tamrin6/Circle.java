public class Circle extends D2{
    private double radious;
    public void calPerimeter()
    {
        this.setPerimeter(Math.PI * radious * 2);
    }
    public void calSurface()
    {
        this.setSurface(Math.PI * radious * radious);
    }
    public void Setradious(double input)
    {
        radious = input;
    }
    public double getRadious()
    {
        return radious;
    }
    
}
