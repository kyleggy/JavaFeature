package com.scott.java.design.pattern.structure.composite.employeesample;

/**
 * Created by lizhaok on 2016/12/12.
 */
public class Developer implements Employee {
    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public Employee getChild(int index) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getTotalSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Developer name is: " + name + ", salary is:" + salary);
    }
}
