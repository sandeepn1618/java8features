package com.learn.stream.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static List<Employee> getTax(String input) {
        return  (input.equalsIgnoreCase("TAX")) ?
           EmployeeDAO.getEmployees().stream()
                    .filter(o -> o.getSalary() > 600000)
                    .collect(Collectors.toList())
        :
             EmployeeDAO.getEmployees().stream()
                    .filter(o -> o.getSalary() <= 600000)
                    .collect(Collectors.toList());

    }
    public static void main(String[] args) {
        System.out.println("TAX Payable \n" +getTax("tax"));
    }
}
