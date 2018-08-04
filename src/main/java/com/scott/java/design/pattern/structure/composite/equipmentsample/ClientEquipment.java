package com.scott.java.design.pattern.structure.composite.equipmentsample;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class ClientEquipment {

    @Test
    public void testEquipment() {
        FloppyDisk floppyDisk = new FloppyDisk("Floppy");
        Card card = new Card("Card");
        Chasis chasis = new Chasis("Chasis");
        chasis.add(floppyDisk);
        chasis.add(card);

        Bus bus = new Bus("Bus");
        Card cardBus = new Card("cardBus");
        bus.add(cardBus);

        chasis.add(bus);

        System.out.println("Total net price is: " + chasis.netPrice());
        System.out.println("Total net price is: " + chasis.disCountPrice());
    }

}
