package com.scott.java.design.pattern.structure.composite.employeesample;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/12/12.
 */
public class EmployeeTest {

    @Test
    public void testEmployee() {
        Employee manager = new Manager("GeneralManager", 50000);
        Employee seniorDeveloper = new Developer("Senior Developer", 25000);
        Employee smallManager = new Manager("SmallManager", 30000);
        Employee developer1 = new Developer("Developer1", 10000);
        Employee developer2 = new Developer("Developer2", 15000);
        smallManager.add(developer1);
        smallManager.add(developer2);
        manager.add(smallManager);
        manager.add(seniorDeveloper);
        manager.print();
        System.out.println(manager.getName() + " total cost is:" + manager.getTotalSalary());
        System.out.println(smallManager.getName() + " total cost is:" + smallManager.getTotalSalary());

    }
}


