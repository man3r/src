package com.greatlearning;

public class Company {
    private double stockPrice;
    private boolean sp_changed;

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public boolean isSp_changed() {
        return sp_changed;
    }

    public void setSp_changed(boolean sp_changed) {
        this.sp_changed = sp_changed;
    }

    public Company() {
    }
}
