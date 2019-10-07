package interfacepractice;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.util.*;
public class Main {
    
    public static void bubbleSort(Shape arr[])
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++) 
            {
                if (arr[j].Area() > arr[j+1].Area()) 
                { 
                    // swap arr[j+1] and arr[i] 
                    Shape temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
            }
        }
    }
    
    public static ArrayList<String> readFile(String address)
    {
        // create an empty array to store the text file in
        ArrayList<String> lines = new ArrayList<String>();       
        try
        {
            // read the file
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            
            // fill the array with the text file
            String line = br.readLine();
            while (line != null)
            {
               lines.add(line);
               line = br.readLine();
            }
        }
        catch(Exception e)
        {
            System.out.println("Failed to read from file: " + "output.txt");
        }
        return lines;
    }
    
    public static void writeFile(String address, ArrayList<String> content)
    {
        try
        { 
            // create the file
            File file = new File(address);
            file.createNewFile();
            PrintWriter printObj = new PrintWriter(file);

            // write the content into the file
            for(int i = 0; i < content.size(); i++)
            {
                printObj.println(content.get(i));
            }
            // close stream
            printObj.close();
        } 
        // if the file was not found, alert the user    
        catch (Exception e)
        {
            System.out.println("Failed to write to file: " + address);
        }

    }
    
    public static void main(String[] args) 
    {
        Rectangle rectangle = new Rectangle(5,5);    
        
        Triangle triangle = new Triangle(5,5);
        
        Circle circle = new Circle(5);
        
        Cuboid cuboid = new Cuboid(5,5,5);
        
        Cylinder cylinder = new Cylinder(5, 5);
        
        Parallelogram parallelogram = new Parallelogram(6,4);
        
        /*System.out.println("\nRectangle:\nLength: " + rectangle.Length() + "\nWidth: " + rectangle.Width() + "\nArea: " + rectangle.Area() + "\nSides: " + rectangle.Sides());
        System.out.println("\nTriangle:\nBase: " + triangle.Base()+ "\nHeight: " + triangle.Height() + "\nArea: " + triangle.Area() + "\nSides: " + triangle.Sides());
        System.out.println("\nCircle:\nRadius: " + circle.Radius() + "\nArea: " + circle.Area());
        System.out.println("\nCuboid:\nLength: " + cuboid.Length() + "\nWidth: " + cuboid.Width() + "\nDepth: " + cuboid.Depth() + "\nArea: " + cuboid.Area() + "\nVolume: " + cuboid.Volume());
        System.out.println("\nCylinder:\nRadius: " + cylinder.Radius() + "\nDepth: " + cylinder.Depth() + "\nArea: " + cylinder.Area() + "\nVolume: " + cylinder.Volume());
        */
        Shape[] myArray = new Shape[6]; 
        myArray[0] = rectangle;
        myArray[1] = triangle;
        myArray[2] = circle;
        myArray[3] = cuboid;
        myArray[4] = cylinder;
        myArray[5] = parallelogram;
        
        bubbleSort(myArray);  
        
        int n = myArray.length; 
        for (int i = 0; i < n; i++) 
        {
            if(myArray[i] instanceof Cuboid)
            {
                System.out.println("\nCuboid:\nLength: " + cuboid.Length() + "\nWidth: " + cuboid.Width() + "\nDepth: " + cuboid.Depth() + "\nArea: " + cuboid.Area() + "\nVolume: " + cuboid.Volume() + "\nSurface Area: " + cuboid.SurfaceArea());
            }
            else if(myArray[i] instanceof Triangle)
            {
                System.out.println("\nTriangle:\nBase: " + triangle.Base()+ "\nHeight: " + triangle.Height() + "\nArea: " + triangle.Area() + "\nSides: " + triangle.Sides());
            }
            else if(myArray[i] instanceof Cylinder)
            {
                System.out.println("\nCylinder:\nRadius: " + cylinder.Radius() + "\nDepth: " + cylinder.Depth() + "\nArea: " + cylinder.Area() + "\nVolume: " + cylinder.Volume() + "\nSurface Area: " + cylinder.SurfaceArea());
            }
            else if(myArray[i] instanceof Rectangle)
            {
                System.out.println("\nRectangle:\nLength: " + rectangle.Length() + "\nWidth: " + rectangle.Width() + "\nArea: " + rectangle.Area() + "\nSides: " + rectangle.Sides());
            }
            else if(myArray[i] instanceof Circle)
            {
                System.out.println("\nCircle:\nRadius: " + circle.Radius() + "\nArea: " + circle.Area());
            }
            else if(myArray[i] instanceof Parallelogram)
            {
                System.out.println("\nParallelogram:\nBase: " + parallelogram.Base() + "\nHeight: " + parallelogram.Height() + "\nArea: " + parallelogram.Area());
            }
        }
        ArrayList<String> outToFile = new ArrayList<String>();
        outToFile.add(0,"This");
        outToFile.add(1,"is");
        outToFile.add(2,"a");
        outToFile.add(3,"file");
        outToFile.add(4,"that");
        outToFile.add(5,"has");
        outToFile.add(6,"been");
        outToFile.add(7,"output");
        outToFile.add(8,"to.");
        writeFile("output.txt",outToFile);
        
        ArrayList<String> readFromFile = new ArrayList<String>();
        readFromFile = readFile("output.txt");
        System.out.println(readFromFile.toString());
    }
}
