package sheet1;
public class Complex
{
    private double Real;
    private double Imaginary;
    private double Magnitude;
    private double Angle;
    
    public Complex()
    {
        this.Real = 0;
        this.Imaginary = 0;
        this.Magnitude = 0;
        this.Angle = 0;
    }
    
    public Complex(double Real, double Imaginary)
    {
        this.Real = Real;
        this.Imaginary = Imaginary;
        this.Magnitude = Math.sqrt((Real*Real)+(Imaginary*Imaginary));
        this.Angle = Math.atan2(Imaginary, Real);
    }
    
    @Override
    public String toString()
    {
        if(Imaginary > 0)
            return Real+" + "+Imaginary+"i";
            
        else if(Imaginary < 0)
            return Real+" - "+Math.abs(Imaginary)+"i";
        
        else
            return Real+"";
    }
    
    public void setReal(double Real){this.Real = Real;}
    public double getReal(){return Real;}
    
    public void setImaginary(double Imaginary){this.Imaginary = Imaginary;}
    public double getImaginary(){return Imaginary;}
    
    public void setMagnitude(){this.Magnitude = Math.sqrt((Real*Real)+(Imaginary*Imaginary));;}
    public double getMagnitude(){return Magnitude;}
    
    public void setAngle(){this.Angle = Math.atan2(Imaginary, Real);}
    public double getAngle(){return Angle;}   
    
    public Complex Add(Complex b)
    {
        Complex c = new Complex();      
        c.setReal(this.Real+b.getReal());
        c.setImaginary(this.Imaginary+b.getImaginary());
        c.setMagnitude();
        c.setAngle();
        return c;
    }
    
    public Complex Subtract(Complex b)
    {
        Complex c = new Complex();
        c.setReal(this.Real-b.getReal());
        c.setImaginary(this.Imaginary-b.getImaginary());
        c.setMagnitude();
        c.setAngle();
        return c;
    }
    
    public Complex Multiply(Complex b)
    {
        Complex c = new Complex();
        double newReal = this.Real*b.getReal() + (-1*this.Imaginary*b.getImaginary());
        double newImaginary = this.Real*b.getImaginary() + this.Imaginary*b.getReal();
        c.setReal(newReal);
        c.setImaginary(newImaginary);
        c.setMagnitude();
        c.setAngle();
        return c;
    }
}
