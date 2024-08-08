package BTVN_module02_session04;

public class Ex01 {
    private float radius;
    private String color;

    public Ex01(){

    }
    public Ex01(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // PHương thức tính diện tích
    public double area() {
        return Math.PI * radius * radius;
    }
    // Phương thức tính chu vi
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
