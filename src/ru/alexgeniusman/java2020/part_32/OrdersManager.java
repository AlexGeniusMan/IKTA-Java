package ru.alexgeniusman.java2020.part_32;

public interface OrdersManager {

    int itemsQuantity(String itemName);

    int itemsQuantity(MenuItem item);

    Order[] getOrders();

    int ordersCostSummary();

    int ordersQuantity();

}
