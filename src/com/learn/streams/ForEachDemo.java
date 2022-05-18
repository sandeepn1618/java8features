package com.learn.streams;

import java.util.*;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sandeep");
        list.add("Santhosh");
        list.add("Sanghvi");
        list.add("SasiPriya");
        list.add("Parvathi");

        list.stream().filter(t->t.endsWith("p")).forEach(o->System.out.println("S Name : "+o));
        list.stream().forEach(o-> System.out.println("Name : "+ o));

        /**
         * map example for key and value
         */
        Map<Integer,String> map =  new HashMap<>();
        map.put(1,"Sandeep");
        map.put(2,"Paravthi");
        map.put(4,"Jasvi");
        /**
         * Looping using forEach
         */
        map.forEach((key,Value)-> System.out.println(key + ":" + Value));

        /**
         * Looping using entrySet
         */
        map.entrySet().stream().forEach((o)-> System.out.println(o));

        /**
         * USing filter to get even id
         */
        map.entrySet().stream().filter(t->t.getKey()%2==0).forEach((o)->System.out.println(o));
    }
}
