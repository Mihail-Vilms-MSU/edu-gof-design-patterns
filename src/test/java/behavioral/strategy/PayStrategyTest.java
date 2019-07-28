package behavioral.strategy;

import org.junit.Test;

public class PayStrategyTest {
    @Test
    public void pay_byPayPal(){
        Order order  = new Order(100);
        String processResult = order.processOrder(new PayPalStrategy("someEmail", "somePassword"));
        System.out.println(processResult);
    }

    @Test
    public void pay_byCreditCard(){
        Order order  = new Order(100);
        String processResult = order.processOrder(new CreditCardStrategy("someNumber", "someName", "someCvv"));
        System.out.println(processResult);
    }
}
