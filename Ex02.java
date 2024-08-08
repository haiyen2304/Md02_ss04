package BTVN_module02_session04;

public class Ex02 {
    private double a,b,c,delta;

    public Ex02(){

    }

    public Ex02(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDelta() {
        return delta=b*2 - 4*a*c;
    }


    public double getDiscriminant() {
        return Math.sqrt(b*2 - 4*a*c);
    }
    public double getroot1() {
        if(getDiscriminant()>=0){
            return (-b + Math.sqrt(getDiscriminant()))/(2*a);
        }else {
            return Double.NaN;
        }

    }
    public double getroot2() {
        if(getDiscriminant()>=0){
            return (-b - Math.sqrt(getDiscriminant()))/(2*a);
        }else {
            return Double.NaN;
        }
    }
}
