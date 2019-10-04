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
public class Parallelogram implements Polygon {
    private int base = 0;
    private int height = 0;
    
    public Parallelogram()
    {   
        System.out.println("Parallelogram: " + this.toString());        
    }
    
    public Parallelogram(int base, int height)
    {   
        this();
        this.base = base;
        this.height = height;
    }
    
    @Override
    public int Sides()
    {
        return 4;              
    }
    
    @Override
    public double Area()
    {
        return base * height;        
    }
    
    public int Base()
    {
        return base;        
    }
    
    public int Height()
    {
        return height;        
    }
}
