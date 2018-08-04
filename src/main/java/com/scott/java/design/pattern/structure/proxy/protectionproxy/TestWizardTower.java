package com.scott.java.design.pattern.structure.proxy.protectionproxy;

import org.junit.Test;

/**
 * Created by lizhaok on 1/7/2018.
 */
public class TestWizardTower {

    @Test
    public void test() {
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Black wizard"));
        proxy.enter(new Wizard("Green wizard"));
        proxy.enter(new Wizard("Brown wizard"));

    }

}
