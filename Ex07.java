package BTVN_module02_session04;

public class Ex07 {
    private double radius=1.0d;
    private String color="red";

    public Ex07() {

    }
    public Ex07(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
