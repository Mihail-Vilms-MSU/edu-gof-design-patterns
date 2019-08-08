package behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StockMarketPricesEvents implements Subject {

    private Map<String, Integer> stockPrices;

    // List of Observers
    private ArrayList<Observer> observers;

    StockMarketPricesEvents(){
        stockPrices = new HashMap<String, Integer>();
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(stockPrices);
        }
    }

    public void setStockPrice(String stockTitle, Integer price){
        stockPrices.put(stockTitle, price);
        notifyObserver();
    }
}
