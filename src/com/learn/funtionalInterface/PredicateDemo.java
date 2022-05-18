package com.learn.funtionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(t->(t%2==0)).forEach(t-> System.out.println("print even "+ t));
      /* Predicate<Integer> prd =  t-> t%2!=0;
           *//* if (t%2 == 0){
                return true;
            } else
                return false;
        };*//*
      //boolean prd1 =  new PredicateDemo().test(54);*/
       // System.out.println(prd.test(45));
    }
}
