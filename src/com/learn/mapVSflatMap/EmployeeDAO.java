package com.learn.mapVSflatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDAO {

    public static  List<Employee> getAllEmployees(){
        return Stream.of(
                new Employee(1,"Sandeep","sandeep@gmail.com", Arrays.asList("123","1234")),
                new Employee(1,"Parvathi","parvathi@gmail.com", Arrays.asList("8445","3434")),
                new Employee(1,"Lavanya","lavanya@gmail.com", Arrays.asList("12","12")),
                new Employee(1,"Anil","anil@gmail.com", Arrays.asList("123","1290"))
        ).collect(Collectors.toList());

    }
}
