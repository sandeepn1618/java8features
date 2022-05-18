package com.learn.mapVSflatMap;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {

      List<Employee> list = EmployeeDAO.getAllEmployees();
      list.stream().map(employee -> employee.getEmail()).collect(Collectors.toList()).forEach(System.out::println);



    }
}
