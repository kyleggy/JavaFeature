package com.scott.java.design.pattern.structure.composite.employeesample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lizhaok on 2016/12/12.
 */
public class Manager implements Employee {
    private List<Employee> employeeList = new ArrayList<>();
    private String name;
    private double salary;
    private double totalSalary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public Employee getChild(int index) {
        return employeeList.get(index);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getTotalSalary() {
        totalSalary = this.getSalary();
        for(Employee employee: employeeList) {
            totalSalary += employee.getTotalSalary();
        }
        return totalSalary;
    }

    @Override
    public void print() {
        System.out.println("The manager name: " + name + ", salary is: " + salary + ".");
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            employee.print();
        }
    }
}
