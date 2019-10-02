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
    
    public Cylinder()
    {   
        System.out.println("Cylinder: " + this.toString());        
    }
    
    public Cylinder(int radius, int depth)
    {
        super(radius);
        this.depth = depth;
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
}