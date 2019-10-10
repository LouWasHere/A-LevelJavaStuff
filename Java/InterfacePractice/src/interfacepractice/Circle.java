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
public class Circle implements Shape {
    private double radius = 0;
    private double area = 0;
    
    public Circle()
    {   
        System.out.println("Circle: " + this.toString());        
    }
    
    public Circle(double radius)
    {   
        this();
        this.radius = radius;
        this.area = 3.14*radius*radius;  
    }
    
    @Override
    public double Area()
    {
        return area;
    }
    
    public double Radius()
    {
        return radius;        
    }
}
