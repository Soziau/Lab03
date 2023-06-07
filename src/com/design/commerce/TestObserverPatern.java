package com.design.commerce;

public class TestObserverPatern
{
    public static void main(String[] args) {

        Order order = new Order();
        order.updateTotalPrice(210);
        order.updateItemQuantity(13);


        System.out.println("Order Total Price: $" + order.getTotalPrice());
        System.out.println("Order Item Quantity: " + order.getItemQuantity());
        System.out.println("Order Shipping Cost: $" + order.getShippingCost());


        order.updateTotalPrice(143);
        order.updateItemQuantity(3);


        System.out.println("\nUpdated Order Total Price: $" + order.getTotalPrice());
        System.out.println("Updated Order Item Quantity: " + order.getItemQuantity());
        System.out.println("Updated Order Shipping Cost: $" + order.getShippingCost());
    }
}