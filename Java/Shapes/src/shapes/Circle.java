/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author l-bishop
 */
public class Circle extends Shape
{
    private int radius;
    
    public Circle()
    {   
        System.out.println("Circle: " + this.toString());        
    }
    
    public Circle(int radius)
    {
        this();
        this.radius = radius;
    }
    
    @Override
    public double Area()
    {
        return (3.14*(radius*radius));
    }
    
    public double Radius()
    {
        return radius;
    }
}
