package com.learn.funtionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


    public static void main(String[] args) {

       List<Integer> list = Arrays.asList(1,2,3,4,5);
       list.stream().forEach(f -> System.out.println("printing number :" +f));
    }
    // () -> {}
}
