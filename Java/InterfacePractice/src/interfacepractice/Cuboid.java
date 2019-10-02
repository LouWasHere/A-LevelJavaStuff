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
public class Cuboid extends Rectangle implements IThreeDimensional
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
    
    @Override
    public double Depth()
    {
        return (depth);
    }
}
