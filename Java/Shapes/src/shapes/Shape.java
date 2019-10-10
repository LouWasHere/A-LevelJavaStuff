/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.Collection.*;

import java.io.*;
import java.util.ArrayList;

public abstract class Shape {    
    public Shape()
    {
        System.out.println("Shape: " + this.toString());
    }
    
    public abstract double Area();
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Shape> shapes = new ArrayList<Shape>();
                       
        // Instantiate an object of each class and add to the shapes array list
        Rectangle rectangle = new Rectangle(1,2);
        shapes.add(rectangle);          
        
        Circle circle = new Circle(5);
        shapes.add(circle);
        
        Cuboid cuboid = new Cuboid(1,2,3);
        shapes.add(cuboid);
        
        Cylinder cylinder = new Cylinder(5, 5);
        shapes.add(cylinder);
        
        // Iterate over each shape in the array list
        for (Shape shape : shapes )    
        {// Print out the shape attributes
            System.out.println("-------------------------------------------");        
            System.out.println(shape.toString() + " : " + shape.Area());  
            System.out.println("Area : " + shape.Area());
            
            if (shape instanceof Polygon)
            {//Printout the Polygon attributes
                System.out.println("Sides : " + ((Polygon)shape).Sides());  
            
                if (shape instanceof Rectangle)
                {// Print out the Rectangle attributes
                    System.out.println("Length : " + ((Rectangle)shape).Length());  
                    System.out.println("Width : " + ((Rectangle)shape).Width());     
                    
                    if (shape instanceof Cuboid)
                    {// Print out the Cuboid attributes
                        System.out.println("Depth : " + ((Cuboid)shape).Depth());  
                        System.out.println("Volume : " + ((Cuboid)shape).Volume()); 
                    }
                }  
                
            }
            if (shape instanceof Circle)
                {// Print out the Circle attributes 
                    System.out.println("Radius : " + ((Circle)shape).Radius());       
                    if (shape instanceof Cylinder)
                    {// Print out the Cylinder attributes 
                        System.out.println("Volume : " + ((Cylinder)shape).Volume());
                        System.out.println("Depth : " + ((Cylinder)shape).Depth());
                    }       
                }
        }
    }
}
