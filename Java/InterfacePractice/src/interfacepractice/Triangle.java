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
public class Triangle implements Polygon {
    private double base = 0;
    private double height = 0;
    
    public Triangle()
    {   
        System.out.println("Triangle: " + this.toString());        
    }
    
    public Triangle(double base, double height)
    {   
        this();
        this.base = base;
        this.height = height;
    }
    
    @Override
    public int Sides()
    {
        return 3;              
    }
    
    @Override
    public double Area()
    {
        return base * height/2;        
    }
    
    public double Base()
    {
        return base;        
    }
    
    public double Height()
    {
        return height;        
    }
}

