public class Shape {
    private String name;
    private String color;

    public Shape() {
        color = "white";
        name = "";
    }

    public Shape(String name) {
        this.name = name;
        color = "white";
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String input) {
        name = input;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
