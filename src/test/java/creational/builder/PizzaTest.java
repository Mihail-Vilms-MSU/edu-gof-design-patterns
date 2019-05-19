package creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTest {

    @Test
    public void build_getPizzaWithPepperoniAndPineapple(){
        Pizza pizza = new Pizza.Builder(20, 30)
                .setPepperoni(20)
                .setPineapple(10)
                .build();

        assertEquals(30, pizza.getCheese());
        assertEquals(20, pizza.getPepperoni());
        assertEquals(10, pizza.getPineapple());
        assertEquals(0, pizza.getMushrooms());
        assertEquals(0, pizza.getPepper());
    }
}
