import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;

import org.junit.Test;

public class OrderTest {
    ArrayList<Order> orderList = new ArrayList<>();
    Order expressOrder= new ExpressOrder("pepe", 4, 7);
    Order expressOrder2= new ExpressOrder("Carlos", 3, 4);
    Order standardOrder= new StandardOrder("Jhon", 4);
    Order standardOrder2= new StandardOrder("Espidy", 6);
    @Test 
    public void CalculateTotalTest(){
        orderList.add(expressOrder);
        orderList.add(expressOrder2);
        orderList.add(standardOrder);
        orderList.add(expressOrder2);
        
    }
    @Test
    public void DifferentValues(){
        assertNotEquals(expressOrder.calculateTotal(),standardOrder.calculateTotal(),0.1);
    }
    @Test
    public void expressOrderNegativeAmmount(){
        assertThrows(IllegalArgumentException.class,()->{
            Order expressorderFailed = new ExpressOrder("PEPE", -4, 0);
        });

    }  
    @Test
    public void standardOrderOrderNegativeAmmount(){
        assertThrows(IllegalArgumentException.class,()->{
            Order standarOrder = new StandardOrder("Jhon", -7);
        });

    }    
    @Test
    public void standarEquals(){
        Order standarOrderx= new StandardOrder("Alex", 7);
        Order standarOrdery= new StandardOrder("Alex", 7);
        assertEquals(standarOrderx.calculateTotal(),standarOrdery.calculateTotal(),0.1);
    }
    
}
