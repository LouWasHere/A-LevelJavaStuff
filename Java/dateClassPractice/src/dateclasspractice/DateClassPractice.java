package dateclasspractice;
import java.time.*;

public class DateClassPractice
{

    public static void main(String[] args)
    {
        LocalDate localDate = LocalDate.of(2003, 4, 12);
        localDate = localDate.plusDays(2);
        System.out.println(localDate.toString());
    }
    
}