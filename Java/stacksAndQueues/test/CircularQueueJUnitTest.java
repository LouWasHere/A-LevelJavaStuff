import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import stacksandqueues.CircularQueue;

/**
 *
 * @author l-bishop
 */
public class CircularQueueJUnitTest
{
    CircularQueue circularQueue;
    
    public CircularQueueJUnitTest() 
    {
        circularQueue = new CircularQueue();
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        
    }
    
    @Before
    public void setUp()
    {
        
    }
    
    @After
    public void tearDown()
    {
        
    }

    @Test
    public void add1()
    {
        circularQueue.add(1);
        assertTrue(circularQueue.pointerValue("front") == 0);
        assertTrue(circularQueue.pointerValue("end") == 0);
        assertTrue(circularQueue.returnSize() == 1);
    }
    @Test
    public void add2()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        assertTrue(circularQueue.pointerValue("front") == 0);
        assertTrue(circularQueue.pointerValue("end") == 1);
        assertTrue(circularQueue.returnSize() == 2);
    }   
    @Test
    public void add3()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        assertTrue(circularQueue.pointerValue("front") == 0);
        assertTrue(circularQueue.pointerValue("end") == 2);
        assertTrue(circularQueue.returnSize() == 3);
    }  
    @Test
    public void remove1()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        assertTrue(circularQueue.pointerValue("front") == 1);
        assertTrue(circularQueue.pointerValue("end") == 2);
        assertTrue(circularQueue.returnSize() == 2);
    }    
    @Test
    public void remove2()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        assertTrue(circularQueue.pointerValue("front") == 2);
        assertTrue(circularQueue.pointerValue("end") == 2);
        assertTrue(circularQueue.returnSize() == 1);
    }    
    @Test
    public void add4()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.add(4);
        assertTrue(circularQueue.pointerValue("front") == 2);
        assertTrue(circularQueue.pointerValue("end") == 3);
        assertTrue(circularQueue.returnSize() == 2);
    }   
    @Test
    public void add5()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.add(4);
        circularQueue.add(5);
        assertTrue(circularQueue.pointerValue("front") == 2);
        assertTrue(circularQueue.pointerValue("end") == 0);
        assertTrue(circularQueue.returnSize() == 3);
    }  
    @Test
    public void isFull1()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.add(4);
        circularQueue.add(5);
        assertTrue(circularQueue.isFull() == false);
    }    
    @Test
    public void add6()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.add(4);
        circularQueue.add(5);
        circularQueue.add(6);
        assertTrue(circularQueue.pointerValue("front") == 2);
        assertTrue(circularQueue.pointerValue("end") == 1);
        assertTrue(circularQueue.returnSize() == 4);
    }   
    @Test
    public void isFull2()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.add(4);
        circularQueue.add(5);
        circularQueue.add(6);
        assertTrue(circularQueue.isFull() == true);
    }    
    @Test
    public void remove3()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.add(4);
        circularQueue.add(5);
        circularQueue.add(6);
        circularQueue.remove();
        assertTrue(circularQueue.pointerValue("front") == 3);
        assertTrue(circularQueue.pointerValue("end") == 1);
        assertTrue(circularQueue.returnSize() == 3);
    }   
    @Test
    public void remove4()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.add(4);
        circularQueue.add(5);
        circularQueue.add(6);
        circularQueue.remove();
        circularQueue.remove();
        assertTrue(circularQueue.pointerValue("front") == 0);
        assertTrue(circularQueue.pointerValue("end") == 1);
        assertTrue(circularQueue.returnSize() == 2);
    }    
    @Test
    public void remove5()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.add(4);
        circularQueue.add(5);
        circularQueue.add(6);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        assertTrue(circularQueue.pointerValue("front") == 1);
        assertTrue(circularQueue.pointerValue("end") == 1);
        assertTrue(circularQueue.returnSize() == 1);
    }    
    @Test
    public void remove6()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.add(4);
        circularQueue.add(5);
        circularQueue.add(6);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        assertTrue(circularQueue.pointerValue("front") == -1);
        assertTrue(circularQueue.pointerValue("end") == -1);
        assertTrue(circularQueue.returnSize() == 0);
    }   
    @Test
    public void isEmpty()
    {
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.add(4);
        circularQueue.add(5);
        circularQueue.add(6);
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        assertTrue(circularQueue.isEmpty() == true);
    }
}
