package com.learn.sort.map;

import java.security.KeyStore;
import java.util.*;

public class SortMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("ABC",1);
        map.put("DCD",2);
        map.put("CDF",3);
        map.put("BEF",4);
        map.put("AFG",5);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        List< Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(o1,o2)-> o2.getKey().compareTo(o1.getKey()));
        for (Map.Entry<String,Integer> entry:list  ) {
            System.out.println(entry.getKey() +":"+entry.getValue());

        }
    }
}
