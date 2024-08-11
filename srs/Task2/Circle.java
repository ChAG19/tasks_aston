package Task2;

public class Circle implements Figure{
    private double radius;
    final private double PI = 3.14;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor){
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public void getPerimetr() {
        System.out.println("Периметр круга - " + 2 * PI * radius);
    }

    @Override
    public void getArea() {
        System.out.println("Площадь круга - " + PI * Math.pow(radius, 2));
    }

    @Override
    public void getBorderColor() {
        System.out.println("Цвет границы круга - " + borderColor);
    }

    @Override
    public void getFillColor() {
        System.out.println("Цвет заливки круга - " + fillColor);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
}
