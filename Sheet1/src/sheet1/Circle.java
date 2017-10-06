package sheet1;
public class Circle
{
    private int x;
    private int y;
    private double radius;
    
    public Circle(int x,int y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    
    public double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
    
    public String toString()
    {
        return "Circle radius: "+radius+"  Circle Area: "+this.calculateArea()+"  Circle Perimeter: "+this.calculatePerimeter();     
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
