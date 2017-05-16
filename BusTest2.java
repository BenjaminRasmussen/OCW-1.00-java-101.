package com.company2;

import java.util.ArrayList;

/**
 * Created by Benjamin R. on 06-08-2016.
 */
public class BusTest2 {
    public static void main(String[] args){
        Hybrid h1= new Hybrid(45, 1.2, Electric.HIGH_VOLTAGE, 150, 1);
        CNGBus c1= new CNGBus(50, 1, 200, 2);
       ElectricBus e1= new ElectricBus(55, 0.9, Electric.LOW_VOLTAGE);

        ArrayList<Bus> list2= new ArrayList<>();
        list2.add(h1);
        list2.add(c1);
        list2.add(e1);
        for (Bus b: list2) {
            System.out.print("Bus: " + b.getID() + " ");
            System.out.print(b.getClass());
            if (b instanceof LiquidFuel)
                System.out.print(" tier: "+ ((LiquidFuel) b).getEmissionTier());
            if (b instanceof Electric)
                System.out.print(" voltage: "+ ((Electric) b).getVoltage());
            System.out.println();
        }
    }
}
