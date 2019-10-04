package interfacepractice;

import java.util.ArrayList;

public class Main {
    
    public static void bubbleSort(Shape arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j].Area() > arr[j+1].Area()) 
                { 
                    // swap arr[j+1] and arr[i] 
                    Shape temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
    
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5,5);    
        
        Triangle triangle = new Triangle(5,5);
        
        Circle circle = new Circle(5);
        
        Cuboid cuboid = new Cuboid(5,5,5);
        
        Cylinder cylinder = new Cylinder(5, 5);
        
        /*System.out.println("\nRectangle:\nLength: " + rectangle.Length() + "\nWidth: " + rectangle.Width() + "\nArea: " + rectangle.Area() + "\nSides: " + rectangle.Sides());
        System.out.println("\nTriangle:\nBase: " + triangle.Base()+ "\nHeight: " + triangle.Height() + "\nArea: " + triangle.Area() + "\nSides: " + triangle.Sides());
        System.out.println("\nCircle:\nRadius: " + circle.Radius() + "\nArea: " + circle.Area());
        System.out.println("\nCuboid:\nLength: " + cuboid.Length() + "\nWidth: " + cuboid.Width() + "\nDepth: " + cuboid.Depth() + "\nArea: " + cuboid.Area() + "\nVolume: " + cuboid.Volume());
        System.out.println("\nCylinder:\nRadius: " + cylinder.Radius() + "\nDepth: " + cylinder.Depth() + "\nArea: " + cylinder.Area() + "\nVolume: " + cylinder.Volume());
        */
        Shape[] myArray = new Shape[5]; 
        myArray[0] = rectangle;
        myArray[1] = triangle;
        myArray[2] = circle;
        myArray[3] = cuboid;
        myArray[4] = cylinder;
        
        bubbleSort(myArray);  
        
        int n = myArray.length; 
        for (int i = 0; i < n-1; i++) 
        {
            if(myArray[i] instanceof Rectangle)
            {
                System.out.println("\nRectangle:\nLength: " + rectangle.Length() + "\nWidth: " + rectangle.Width() + "\nArea: " + rectangle.Area() + "\nSides: " + rectangle.Sides());
            }
            if(myArray[i] instanceof Triangle)
            {
                System.out.println("\nTriangle:\nBase: " + triangle.Base()+ "\nHeight: " + triangle.Height() + "\nArea: " + triangle.Area() + "\nSides: " + triangle.Sides());
            }
            if(myArray[i] instanceof Circle)
            {
                System.out.println("\nCircle:\nRadius: " + circle.Radius() + "\nArea: " + circle.Area());
            }
            if(myArray[i] instanceof Cuboid)
            {
                System.out.println("\nCuboid:\nLength: " + cuboid.Length() + "\nWidth: " + cuboid.Width() + "\nDepth: " + cuboid.Depth() + "\nArea: " + cuboid.Area() + "\nVolume: " + cuboid.Volume());
            }
            if(myArray[i] instanceof Cylinder)
            {
                System.out.println("\nCylinder:\nRadius: " + cylinder.Radius() + "\nDepth: " + cylinder.Depth() + "\nArea: " + cylinder.Area() + "\nVolume: " + cylinder.Volume());
            }
        }
    }
}
    
