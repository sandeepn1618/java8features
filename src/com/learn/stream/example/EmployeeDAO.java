package com.learn.stream.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

   public static List<Employee> getEmployees(){

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Sandeep",1250000,1234,"123","ABC"));
       list.add(new Employee(2,"Parvathi",65900,1234,"123","ABC"));
       list.add(new Employee(3,"Thanmai",56700,1234,"123","ABC"));
       list.add(new Employee(4,"Anil",59999,1234,"123","ABC"));
       list.add(new Employee(5,"Lavanya",1000000,1234,"123","ABC"));
        return list;
    }

}
