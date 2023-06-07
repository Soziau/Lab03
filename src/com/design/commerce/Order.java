package com.design.commerce;

public class Order
{
    private double totalPrice;
    private int itemQuantity;
    private double shippingCost;
    private OrderObserver priceObserver;
    private OrderObserver quantityObserver;

    public Order() {
        priceObserver = new PriceObserver();
        quantityObserver = new QuantityObserver();
    }


    public void notifyObservers() {
        priceObserver.update(this);
        quantityObserver.update(this);
    }

    public void updateTotalPrice(double newPrice) {
        this.totalPrice = newPrice;
        notifyObservers();
    }

    public void updateItemQuantity(int newQuantity) {
        this.itemQuantity = newQuantity;
        notifyObservers();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
}
