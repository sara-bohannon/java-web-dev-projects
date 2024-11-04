package org.launchcode;

import java.util.Comparator;


import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone cone1, Cone cone2) {
        double cost1 = cone1.getCost();
        double cost2 = cone2.getCost();

        if (cost1 < cost2) {
            return -1;
        } else if (cost1 > cost2) {
            return 1;
        } else {
            return 0;
        }
    }
}