package sheet1;
public class Point 
{
    private double x;
    private double y;
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double getLength(Point p)
    {
        double x2 = p.getX();
        double y2 = p.getY();
        return Math.sqrt(((x-x2)*(x-x2))+((y-y2)*(y-y2)));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}
