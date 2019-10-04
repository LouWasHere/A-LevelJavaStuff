/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepractice;

/**
 *
 * @author l-bishop
 */
public class Cylinder extends Circle implements IThreeDimensional 
{
    private int depth;
    private double surfaceArea;
    
    public Cylinder()
    {   
        System.out.println("Cylinder: " + this.toString());        
    }
    
    public Cylinder(double radius, int depth)
    {
        super(radius);
        this.depth = depth;
        this.surfaceArea = (3.14*Radius()*Radius())*((3.14*(Radius()+Radius()))*depth);
    }
    
    @Override
    public double Volume()
    {
        return (3.14*Radius()*Radius()*depth);
    }
    
    @Override
    public double Depth()
    {
        return (depth);
    }
    
    public double SurfaceArea()
    {
        return (surfaceArea);
    }
}