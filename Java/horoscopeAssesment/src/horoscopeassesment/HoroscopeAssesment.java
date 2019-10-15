package horoscopeassesment;
import java.time.*;
import java.io.*;
import java.util.*;

public class HoroscopeAssesment {

    public static String startMenu()
    {
        boolean loop = true;
        while(loop == true)
        {
            String inputString = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1 – Display Horoscope\n2 - Exit");
            try
            {
                inputString = br.readLine();
            }
            catch (IOException e)
            {
                System.out.println("Error: " + e);
            }
            if(inputString.equals("1")||inputString.equals("2"))
            {
                loop = false;
                return inputString;
            }
            else
            {
                System.out.println("Please enter a valid option.\n");
            }
        }
        return null;
        
    }
    
    public static void main(String[] args) 
    {
        boolean end = false;
        while(end == false)
        {
            String menuSelection = startMenu();
            if("2".equals(menuSelection))
            {
                end = true;
            }
            else if("1".equals(menuSelection))
            {
                GetUserInfo getUserInfo = new GetUserInfo();
                getUserInfo.getName();
            }
        }
    }
}
