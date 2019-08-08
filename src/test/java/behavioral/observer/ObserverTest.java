package behavioral.observer;

import org.junit.Test;

public class ObserverTest {
    @Test
    public void notifyObserver(){
        StockMarketPricesEvents stockMarket = new StockMarketPricesEvents();
        stockMarket.setStockPrice("Apple", 100);
        stockMarket.setStockPrice("Google", 100);
        stockMarket.setStockPrice("Amazon", 100);

        Observer pricesObserver = new StockPricesObserver(stockMarket);
        stockMarket.setStockPrice("Amazon", 120); // <-- observer prints new prices
        stockMarket.setStockPrice("Google", 130); // <-- observer prints new prices
    }
}
