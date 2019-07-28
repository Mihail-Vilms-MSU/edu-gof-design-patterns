package behavioral.strategy;

public class Order {
    private int totalCost;

    Order(int cost){
        this.totalCost = cost;
    }

    public String processOrder(PayStrategy payStrategy){
        return payStrategy.pay(this.totalCost);
    }
}
