package com.learn.funtionalInterface;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a","b");

        String el =   list.stream().findAny().orElseGet(()-> "Hi Sandeep");

        System.out.println(el);
    }



}
