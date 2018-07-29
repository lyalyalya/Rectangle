package RectangleArea;

public class Rectangle {
    private Point a;
    private Point b;
    private double area;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.area = Math.abs((a.x - b.x) * (a.y - b.y));
    }

    public double getArea() {
        return area;
    }
}
