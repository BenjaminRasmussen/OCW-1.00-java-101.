package com.company2;

import java.util.ArrayList;

/**
 * Created by Benjamin R. on 06-08-2016.
 */
public class BusTest {
    public static void main(String[]args){
        ArrayList<Bus> list = new ArrayList<>();

        CNGBus ChinaBus1 = new CNGBus(50, 1000000, 200, 2);
        Hybrid HybridBus1 = new Hybrid(45, 1200000, Electric.HIGH_VOLTAGE, 150, 1);
        list.add(ChinaBus1);
        list.add(HybridBus1);
        for (Bus term : list) {
            if (term instanceof CNGBus) {

                System.out.println("Bus: "+ term.getID()+ " EmissionTier: " +((CNGBus) term).getEmissionTier());
            }
            if (term instanceof Hybrid) {
                System.out.println("Bus: " + term.getID()+ " EmissionTier: "  +((Hybrid) term).getEmissionTier());
            }

        }
    }
}
