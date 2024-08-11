package Task2;

public class Triangle implements Figure{

    private double a;
    private double b;
    private double c;
    private String borderColor;
    private String fillColor;

    public Triangle(double a, double b, double c, String borderColor, String fillColor){
        this.a = a;
        this.b = b;
        this.c = c;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public void getPerimetr() {
        System.out.println("Периметр треугольника - " + (a + b + c));
    }

    @Override
    public void getArea() {
        double p = (a + b + c) / 2;
        System.out.println("Площадь треугольника - " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    public void getBorderColor() {
        System.out.println("Цвет границы треугольника - " + borderColor);
    }

    @Override
    public void getFillColor() {
        System.out.println("Цвет заливки треугольника - " + fillColor);
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

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }
}
