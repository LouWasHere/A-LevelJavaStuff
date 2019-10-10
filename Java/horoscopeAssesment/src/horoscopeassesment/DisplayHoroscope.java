/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscopeassesment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.*;
import java.math.*;
import java.util.*;

public class DisplayHoroscope
{
    public static ArrayList<String> readFile(String address)
    {
        // create an empty array to store the text file in
        ArrayList<String> lines = new ArrayList<String>();       
        try
        {
            // read the file
            BufferedReader br = new BufferedReader(new FileReader(address));
            
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
            System.out.println("Failed to read from file: " + address);
        }
        return lines;
    }
    
    public static void displayHoroscope(String name, LocalDate dateOfBirth)
    {
        if((dateOfBirth.getMonthValue() == 3 && dateOfBirth.getDayOfMonth() >= 21)||dateOfBirth.getMonthValue() == 4 && dateOfBirth.getDayOfMonth() <= 19)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Aries, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("aries.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 4 && dateOfBirth.getDayOfMonth() >= 20)||dateOfBirth.getMonthValue() == 5 && dateOfBirth.getDayOfMonth() <= 20)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Taurus, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("taurus.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 5 && dateOfBirth.getDayOfMonth() >= 21)||dateOfBirth.getMonthValue() == 6 && dateOfBirth.getDayOfMonth() <= 20)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Gemini, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("gemini.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 6 && dateOfBirth.getDayOfMonth() >= 21)||dateOfBirth.getMonthValue() == 7 && dateOfBirth.getDayOfMonth() <= 22)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Cancer, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("cancer.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 7 && dateOfBirth.getDayOfMonth() >= 23)||dateOfBirth.getMonthValue() == 8 && dateOfBirth.getDayOfMonth() <= 22)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Leo, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("leo.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 8 && dateOfBirth.getDayOfMonth() >= 23)||dateOfBirth.getMonthValue() == 9 && dateOfBirth.getDayOfMonth() <= 22)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Virgo, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("virgo.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 9 && dateOfBirth.getDayOfMonth() >= 23)||dateOfBirth.getMonthValue() == 10 && dateOfBirth.getDayOfMonth() <= 22)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Libra, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("libra.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 10 && dateOfBirth.getDayOfMonth() >= 23)||dateOfBirth.getMonthValue() == 11 && dateOfBirth.getDayOfMonth() <= 21)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Scorpio, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("scorpio.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 11 && dateOfBirth.getDayOfMonth() >= 22)||dateOfBirth.getMonthValue() == 12 && dateOfBirth.getDayOfMonth() <= 21)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Sagittarius, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("sagittarius.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 12 && dateOfBirth.getDayOfMonth() >= 22)||dateOfBirth.getMonthValue() == 1 && dateOfBirth.getDayOfMonth() <= 19)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Capricorn, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("capricorn.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 1 && dateOfBirth.getDayOfMonth() >= 20)||dateOfBirth.getMonthValue() == 2 && dateOfBirth.getDayOfMonth() <= 18)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Aquarius, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("aquarius.txt");
            System.out.println(lines.get(i));
        }
        else if((dateOfBirth.getMonthValue() == 2 && dateOfBirth.getDayOfMonth() >= 19)||dateOfBirth.getMonthValue() == 3 && dateOfBirth.getDayOfMonth() <= 20)
        {
            System.out.println("\n\nHello, " + name + ". Your Star Sign is Pisces, so your horoscope for today is:");
            int i = (int)(Math.random()*((3-1)+1))+1;
            ArrayList<String> lines = new ArrayList<String>();
            lines = readFile("pisces.txt");
            System.out.println(lines.get(i));
        }
    }
}
