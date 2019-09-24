package shapes;

public class Cylinder extends Circle
{
    private int depth;
    
    public Cylinder()
    {   
        System.out.println("Cylinder: " + this.toString());        
    }
    
    public Cylinder(int radius, int depth)
    {
        super(radius);
        this.depth = depth;
    }
    
    public double Volume()
    {
        return (3.14*Radius()*Radius()*depth);
    }
    
    public double Depth()
    {
        return (depth);
    }
}