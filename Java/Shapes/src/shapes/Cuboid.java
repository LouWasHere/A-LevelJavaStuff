package shapes;

public class Cuboid extends Rectangle
{
    private int depth;
    
    public Cuboid()
    {   
        System.out.println("Cuboid: " + this.toString());        
    }
    
    public Cuboid(int length, int width, int depth)
    {
        super(length, width);
        this.depth = depth;
    }
    
    public double Volume()
    {
        return (Area()*depth);
    }
    
    public double Depth()
    {
        return (depth);
    }
}
