package BTVN_module02_session04;

public class Th1_Rectangle {

    private float width, height;

    public Th1_Rectangle() {
        this.width = 0.0f;
        this.height = 0.0f;
    }

    public Th1_Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea() {
        return width * height;
    }

    public float getPerimeter() {
        return (width + height) * 2;
    }

    public String display() {
        return this.width + " " + this.height;
    }


}
