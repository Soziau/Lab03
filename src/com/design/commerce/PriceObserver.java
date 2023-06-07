package com.design.commerce;

public class PriceObserver implements OrderObserver
{
    private static final double DISCOUNT_AMOUNT = 20;

    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            double discountedPrice = order.getTotalPrice() - DISCOUNT_AMOUNT;
            order.updateTotalPrice(discountedPrice);
        }
    }
}
