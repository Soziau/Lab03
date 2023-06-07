package com.design.commerce;

public class QuantityObserver implements OrderObserver
{
    private static final double DEFAULT_COST = 10;
    private static final double ZERO_SHIPPING_COST = 0;
    private static final int MAX_ITEMS_SHIPPING = 5;

    @Override
    public void update(Order order) {
        if (order.getItemQuantity() > MAX_ITEMS_SHIPPING) {
            order.setShippingCost(ZERO_SHIPPING_COST);
        } else {
            order.setShippingCost(DEFAULT_COST);
        }
    }
    }
