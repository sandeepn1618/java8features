package com.learn.sort.map;

import com.learn.stream.example.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<Employee,Integer> map = new java.util.TreeMap<>((o1,o2)-> (int) (o1.getSalary()-o2.getSalary()));
        map.put(new Employee(1,"Sandeep",123,939,"123","1234"),1);
        map.put(new Employee(2,"Ajith",1235,939,"123","1234"),1);
        map.put(new Employee(3,"CAls",12,939,"123","1234"),1);
        map.put(new Employee(4,"Tirumala",0,939,"123","1234"),1);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(System.out::println);
    }
}
