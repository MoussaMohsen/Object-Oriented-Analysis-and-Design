package sheet1;
public class Square extends Rectangle
{
    private double length;
    public Square(int x , int y , int length)
    {
        super(x,y,length,length);
        this.length = length;
    }
    
    public String toString()
    {
        return "Square length: "+length+"  Square Area: "+this.calculateArea()+"  Square Perimeter: "+this.calculatePerimeter();
    }
    
    public void setWidth(double Width)
    {
        super.setWidth(Width);
        super.setLength(Width);
    }
}
