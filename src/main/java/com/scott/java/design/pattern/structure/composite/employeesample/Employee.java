package com.scott.java.design.pattern.structure.composite.employeesample;

/**
 * Created by lizhaok on 2016/12/12.
 */
public interface Employee {

    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int index);
    public String getName();
    public double getSalary();
    public double getTotalSalary();
    public void print();
}
