package ru.alexgeniusman.java2020.part_23;

import java.util.*;

public class Glossary {

    public Glossary() {
        CreateMap();
    }
    public Map<String, String> CreateMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Abc", "abc");
        map.put("Ade", "cde");
        map.put("Wknmf", "cde");
        map.put("Brk", "cde");
        map.put("Cfg", "efg");
        map.put("Cre", "cde");
        map.put("Сbc", "cde");
        map.put("Clg", "efg");

        Map<String, String> copiedMap = new HashMap<>();

        copiedMap.put("Abc", "abc");
        copiedMap.put("Ade", "cde");
        copiedMap.put("Wknmf", "cde");
        copiedMap.put("Brk", "cde");
        copiedMap.put("Cfg", "efg");
        copiedMap.put("Cre", "cde");
        copiedMap.put("Сbc", "cde");
        copiedMap.put("Clg", "efg");


        for(Map.Entry<String, String> el : map.entrySet()) {
            String key = el.getKey();
            String value = el.getValue();
            System.out.println(key+" "+value);
        }

        for(Map.Entry<String, String> el_1 : map.entrySet()) {
            int k=0;
            String value_1 = el_1.getValue();
            for(Map.Entry<String, String> el_2 : map.entrySet()) {
                String key_2 = el_2.getKey();
                String value_2 = el_2.getValue();
                if (value_1==value_2) k++;
                if ((k>1)&&(value_1==value_2)) {
                    copiedMap.remove(key_2);

                }
            }
        }

        System.out.println("Map after deleting");
        if (copiedMap.size()!=0) {
            for (Map.Entry<String, String> pair : copiedMap.entrySet()) {
                String key = pair.getKey();
                String value = pair.getValue();
                System.out.println(key + " " + value);
            }
        }
        return copiedMap;
    }

    public static void main(String[] args) {
        new Glossary();
    }
}

