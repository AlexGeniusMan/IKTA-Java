package ru.alexgeniusman.java2020.part_29;

public interface Order {

    boolean add(Item item);

    String[] itemsNames();

    int itemsQuantity();

    int itemQuantity(String itemName);

    Item[] getItems();

    boolean remove(String itemName);

    int removeAll(String itemName);

    Item[] sortedItemByCostDesc();

    int costTotal();

}
