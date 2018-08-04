package com.scott.java.design.pattern.structure.proxy.protectionproxy;

/**
 * Created by lizhaok on 1/7/2018.
 */
public class WizardTowerProxy implements WizardTower {
    private WizardTower wizardTower;
    private static final int NUM_WIZARDS_ALLOWED = 3;

    private int numWizards;

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            wizardTower.enter(wizard);
            numWizards++;
        } else {
            System.out.println(wizard + " is not allowed to enter!");
        }

    }
}
