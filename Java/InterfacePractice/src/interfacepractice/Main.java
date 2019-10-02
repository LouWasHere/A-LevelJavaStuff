package interfacepractice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(1,2);    
        
        Triangle triangle = new Triangle(1,2);
        
        Circle circle = new Circle(5);
        
        Cuboid cuboid = new Cuboid(1,2,3);
        
        Cylinder cylinder = new Cylinder(5, 5);
        
        System.out.println("\nRectangle:\nLength: " + rectangle.Length() + "\nWidth: " + rectangle.Width() + "\nArea: " + rectangle.Area() + "\nSides: " + rectangle.Sides());
        System.out.println("\nTriangle:\nBase: " + triangle.Base()+ "\nHeight: " + triangle.Height() + "\nArea: " + triangle.Area() + "\nSides: " + triangle.Sides());
        System.out.println("\nCircle:\nRadius: " + circle.Radius() + "\nArea: " + circle.Area());
        System.out.println("\nCuboid:\nLength: " + cuboid.Length() + "\nWidth: " + cuboid.Width() + "\nDepth: " + cuboid.Depth() + "\nVolume: " + cuboid.Volume());
        System.out.println("\nCylinder:\nRadius: " + cylinder.Radius() + "\nDepth: " + cylinder.Depth() + "\nVolume: " + cylinder.Volume());
    }
}
    
