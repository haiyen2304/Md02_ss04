package BTVN_module02_session04;

public class Ex04 {
    int speed;
    double radius;
    String color;
    Boolean on;

    public Ex04(int speed, double radius, String color, Boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public Ex04() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public Boolean getOn() {
        return on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        if(on){
            return "speed: " + speed + ", radius: " + radius + ", color: " + color + ", on: " + on;
        }else {
            return "speed: " + speed + ", radius: " + radius + ", color: " + color + ", on: " + on;
        }
    }

}
