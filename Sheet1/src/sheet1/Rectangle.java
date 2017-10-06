package sheet1;
public class Rectangle implements Shape
{
    private int x;
    private int y;
    private double length;
    private double width;
    
    public Rectangle(int x,int y, double length, double width)
    {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea()
    {
        return length*width;
    }
    
    public double calculatePerimeter()
    {
        return 2*(length+width);
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public String toString()
    {
        return "Rectangle length: "+length+"Rectangle width: "+width+"  Rectangle Area: "+this.calculateArea()+"  Rectangle Perimeter: "+this.calculatePerimeter();   
    }
}
