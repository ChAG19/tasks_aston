package Task2;

public class Rectangle implements Figure{

    private double a;
    private double b;
    private String borderColor;
    private String fillColor;

    public Rectangle(double a, double b, String borderColor, String fillColor){
        this.a = a;
        this.b = b;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public void getPerimetr() {
        System.out.println("Периметр прямоугольника - " + (a * 2 + b * 2));
    }

    @Override
    public void getArea() {
        System.out.println("Площадь прямоугольника - " + a * b);
    }

    @Override
    public void getBorderColor() {
        System.out.println("Цвет границы прямоугольника - " + borderColor);
    }

    @Override
    public void getFillColor() {
        System.out.println("Цвет заливки прямоугольника - " + fillColor);
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

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }
}
