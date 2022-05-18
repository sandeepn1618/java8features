package com.learn.exception;

public class ageClass {
    public static void main(String[] args) {
        int age = 3;
        if(age < 18)
            try {
                    throw new invalidAgeException("");
            } catch (invalidAgeException e) {
                System.out.println("Abc");;
            }
        else
            System.out.println("valid age");
    }


}
