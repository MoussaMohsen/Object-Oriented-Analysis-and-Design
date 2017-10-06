package sheet1;
public class Ellipse
{
     private int x;
    private int y;
    private double a;
    private double b;
    
    public Ellipse(int x,int y, double a, double b)
    {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }
    
    public double calculateArea()
    {
        return Math.PI*a*b;
    }
    
    public double calculatePerimeter()
    {
        return 2*Math.PI*Math.sqrt(0.5*((a*a)+(b*b)));
    }
    
    public String toString()
    {
        return "Ellipse length: "+a+"   Ellipse Width: "+b+"  Ellipse Area: "+this.calculateArea()+"  Ellipse Perimeter: "+this.calculatePerimeter();     
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
    
}
