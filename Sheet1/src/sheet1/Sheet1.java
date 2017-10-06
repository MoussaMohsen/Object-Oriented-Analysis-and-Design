package sheet1;
public class Sheet1 
{
    public static void main(String[] args)
    {
        Complex a = new Complex(2,-5);
        Complex b = new Complex(-1,3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.Add(b));
        System.out.println(a.Subtract(b));
        System.out.println(a.Multiply(b));
        System.out.println("------------------------");
        
        SecondOrderEquation Eq = new SecondOrderEquation(2,-5,7);
        System.out.println(Eq);
        System.out.println(Eq.Evaluate(5));
        Eq.getDerivative();
        Complex[] C = Eq.Solve();
        for(int i=0 ; i < C.length ; i++)
            System.out.println(C[i]);
        System.out.println("-------------------------");
        
        Circle c = new Circle(0,0,3);
        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());
        System.out.println("-------------------------");
        
        Rectangle r = new Rectangle(0,0,7,5);
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());
        System.out.println("-------------------------");
        
        Ellipse e = new Ellipse(0,0,2,3);
        System.out.println(e.calculateArea());
        System.out.println(e.calculatePerimeter());
        System.out.println("-------------------------");
        
        Square s = new Square(0,0,4);
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());
        System.out.println("-------------------------");
        
        Triangle t = new Triangle(new Point(0,2),new Point(1,5), new Point(3,7));
        System.out.println(t.calculateArea());
        System.out.println(t.calculatePerimeter());
    }  
}
