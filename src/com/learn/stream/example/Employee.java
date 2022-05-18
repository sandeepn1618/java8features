package com.learn.stream.example;

public class Employee {
    private int id;
    private String name;

    private  double salary;

    private int mobile;
    private String userName;
    private String password;

    public Employee(int id, String name,double salary, int mobile, String userName, String password) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.mobile = mobile;
        this.userName = userName;
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", mobile=" + mobile +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
