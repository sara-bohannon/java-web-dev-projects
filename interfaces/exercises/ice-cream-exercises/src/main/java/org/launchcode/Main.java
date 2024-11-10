package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();


        flavors.sort(new FlavorComparator());


        System.out.println("Flavors:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        cones.sort(new ConeComparator());

        System.out.println("Cones:");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $kkk"  + cone.getCost());
        }
    }
}




// TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

// TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

// TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

