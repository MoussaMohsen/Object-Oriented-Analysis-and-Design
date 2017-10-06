package sheet1;
public class SecondOrderEquation 
{
    private double a;
    private double b;
    private double c;
    
    public SecondOrderEquation()
    {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    
    public SecondOrderEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String toString()
    {
        if(b > 0)
            if(c > 0)
                return a+"X^2 + "+b+"X + "+c;
                
            else
                return a+"X^2 + "+b+"X - "+Math.abs(c);
        
        else
            if(c > 0)
                return a+"X^2 - "+Math.abs(b)+"X + "+c;
                
            else
                return a+"X^2 + "+Math.abs(b)+"X - "+Math.abs(c);
    }
    
    public double Evaluate(double x)
    {
        double result = (a*Math.pow(x,2))+(b*x)+c;
        return result;
    }
    
    public void getDerivative()
    {
        if(b > 0)
            System.out.println(a*2+"X + "+b);
        
        else
            System.out.println(a*2+"X - "+Math.abs(b));
    }
    
    public Complex[] Solve()
    {
        double underRoot = (b*b) - (4*a*c);
        if(underRoot < 0)
        {
            Complex[] C = new Complex[2];
            underRoot = Math.abs(underRoot);
            underRoot = Math.sqrt(underRoot);
            C[0] = new Complex((-1*b)/(2*a) , underRoot/(2*a));
            C[1] = new Complex((-1*b)/(2*a) , -underRoot/(2*a));
            return C;
        }
        
        else
        {
            Complex[] C = new Complex[2];
            underRoot = Math.sqrt(underRoot);
            double result1 = ((-1*b) + underRoot)/(2*a);
            double result2 = ((-1*b) - underRoot)/(2*a);
            C[0] = new Complex(result1 , 0);
            C[1] = new Complex(result2 , 0);
            return C;
        }    
    }
}
