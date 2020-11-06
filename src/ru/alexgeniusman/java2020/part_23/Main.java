package ru.alexgeniusman.java2020.part_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<City> cities = List.of(
                new City("Абу-Даби", "ОАЭ"),
                new City("Киев", "Украина"),
                new City("СПб", "Россия"),
                new City("Москва", "Россия"),
                new City("Минск", "Беларусь"),
                new City("Ангарск", "Россия"),
                new City("Запорожье", "Украина")
        );

        Map<String, ArrayList<String>> citiesMap = new HashMap<>();
        for (City city : cities) {
            if (!citiesMap.containsKey(city.getCountry())) {
                citiesMap.put(city.getCountry(), new ArrayList<>());
            }
            citiesMap.get(city.getCountry()).add(city.getName());
        }

        citiesMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}