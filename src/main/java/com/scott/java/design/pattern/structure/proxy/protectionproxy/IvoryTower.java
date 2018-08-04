package com.scott.java.design.pattern.structure.proxy.protectionproxy;

/**
 * Created by lizhaok on 1/6/2018.
 */
public class IvoryTower implements WizardTower {

    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard + " entered into the tower");
    }
}
