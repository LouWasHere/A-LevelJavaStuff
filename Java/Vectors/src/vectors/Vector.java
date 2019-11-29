/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.math.*;
/**
 *
 * @author dw
 */
public class Vector implements IVector
{
    double x;
    double y;
    public Vector(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public double x() 
    {
        return this.x;
    }
    
    @Override
    public double y() 
    {
        return this.y;
    }    
    
    @Override
    public String toString()
    {
        return Double.toString(x()) + ":" + Double.toString(y());
    }
}
