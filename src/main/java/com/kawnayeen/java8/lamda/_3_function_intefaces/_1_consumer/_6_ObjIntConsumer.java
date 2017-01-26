package com.kawnayeen.java8.lamda._3_function_intefaces._1_consumer;

import java.util.function.ObjIntConsumer;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _6_ObjIntConsumer {
    public static void main(String[] args) {
        ObjIntConsumer<StockInfo> calculateTotalPrice = (stockInfo, amount) -> {
            System.out.println(stockInfo.toString());
            System.out.println("Price of " + amount + " unit is : " + stockInfo.getPrice() * amount);
        };

        StockInfo stockInfo = new StockInfo("TITAS GASS", 55);
        calculateTotalPrice.accept(stockInfo, 200);
    }
}

class StockInfo {
    private String ticker;
    private double price;

    public StockInfo(String ticker, double price) {
        this.ticker = ticker;
        this.price = price;
    }

    public String getTicker() {
        return ticker;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "StockInfo{" +
                "ticker='" + ticker + '\'' +
                ", price=" + price +
                '}';
    }
}
