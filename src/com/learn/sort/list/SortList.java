package com.learn.sort.list;

import com.learn.stream.example.Employee;
import com.learn.stream.example.EmployeeDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()- o2.getSalary());
    }
}*/
public class SortList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(5);
        /**
         *  older version
         */
        Collections.sort(list);
        System.out.println(list);
        /**
         * java 8 simplified
         */
        System.out.println("Simplified Java 8");
        List<Employee> emp = EmployeeDAO.getEmployees();
        Collections.sort(emp, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        System.out.println(emp);
        /**
         * Java 8 using sorted
         */
        System.out.println("-------------------------------------");
        list.stream().sorted(Comparator.reverseOrder()).forEach(o -> System.out.println(o));

        /**
         * if we want sort based on specific field
         */
        List<Employee> emp1 = EmployeeDAO.getEmployees();
        Collections.sort(emp1, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        System.out.println(emp1);
        System.out.println("----------------------------------------");
        emp.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .forEach(t -> System.out.println(t));

    }

}

