package behavioral.observer;

import java.util.Map;

public class StockPricesObserver implements Observer{

    Map<String, Integer> stockPrices;

    private Subject stockMarketPrices;

    public StockPricesObserver(Subject stockMarketPrices){
        this.stockMarketPrices = stockMarketPrices;
        stockMarketPrices.register(this);
    }

    @Override
    public void update(Map<String, Integer> stockPrices) {
        System.out.println("New prices: " + stockPrices);
    }

}
