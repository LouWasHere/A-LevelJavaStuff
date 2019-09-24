/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.Collection.*;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author dw
 */
public abstract class Shape {    
    public Shape()
    {
        System.out.println("Shape: " + this.toString());
    }
    
    public abstract double Area();   
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Shape> shapes = new ArrayList<Shape>();
                       
        // Instantiate an object of each class and add to the shapes array list
        Rectangle rectangle = new Rectangle(1,2);
        shapes.add(rectangle);                          
        
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
                }  
            }
        }
    }
}
