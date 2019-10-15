/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscopeassesment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;

/**
 *
 * @author l-bishop
 */
public class GetUserInfo 
{
    public static boolean isNumeric(String strNum) 
    {
        try 
        {
            double d = Double.parseDouble(strNum);
        } 
        catch (NumberFormatException | NullPointerException nfe)
        {
            return false;
        }
        return true;
    }
    
    public static void getName()
    {
        String inputStringName = null;
        boolean loop = true;
        while(loop == true)
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What is your name?");
            try
            {
                inputStringName = br.readLine();
            }
            catch (IOException e)
            {
                System.out.println("Error: " + e);
            }
            if("".equals(inputStringName))
            {
                System.out.println("That wasn't a name, silly!");
            }
            else
            {
                loop = false;
            }
        }
        getDateOfBirth(inputStringName);
    }
    public static void getDateOfBirth(String name)
    {
        LocalDate dateOfBirth = LocalDate.now();
        boolean loop = true;
        while(loop == true)
        {
            String inputStringYear = null;
            String inputStringMonth = null;
            String inputStringDay = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What year were you born in?");
            try
            {
                inputStringYear = br.readLine();
            }
            catch (IOException e)
            {
                System.out.println("Error: " + e);
            }
            if(isNumeric(inputStringYear) == false)
            {
                System.out.println("Doofus. That wasn't a valid number, was it?");
            }
            else
            {
                System.out.println("What month were you born in? (1 to 12)");
                try
                {
                    inputStringMonth = br.readLine();
                }
                catch (IOException e)
                {
                    System.out.println("Error: " + e);
                }
                double d = Double.parseDouble(inputStringMonth);
                if(isNumeric(inputStringMonth)==false || d>12 || d<1)
                {
                System.out.println("Doofus. That wasn't a valid number, was it?");
                }
                else
                {
                    System.out.println("What day were you born on? (1 to 31)");
                    try
                    {
                        inputStringDay = br.readLine();
                    }
                    catch (IOException e)
                    {
                        System.out.println("Error: " + e);
                    }
                    d = Double.parseDouble(inputStringDay);
                    if(isNumeric(inputStringDay)==false || d>31 || d<1)
                    {
                    System.out.println("Doofus. That wasn't a valid number, was it?");
                    }
                    else
                    {
                        int year = Integer.parseInt(inputStringYear);
                        int month = Integer.parseInt(inputStringMonth);
                        int day = Integer.parseInt(inputStringDay);
                        boolean error = false;
                        try
                        {
                            dateOfBirth = LocalDate.of(year, month, day);
                        }
                        catch(DateTimeException e)
                        {
                            System.out.println("So... That didn't work. The date wasn't valid! Try again.");  
                            error = true;
                        }
                        if(error == true)
                        {
                            loop = true;                      
                        }
                        else
                        {
                            loop = false;
                        }
                    }
                }
            }
        }
        System.out.println("Ah, so you were born on " + dateOfBirth.toString());
        DisplayHoroscope dispHoro = new DisplayHoroscope();
        dispHoro.displayHoroscope(name, dateOfBirth);
    }
}
