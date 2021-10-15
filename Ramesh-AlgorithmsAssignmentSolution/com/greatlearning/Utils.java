package com.greatlearning;

import com.greatlearning.*;

public class Utils {

    public static boolean stockSearch(Company[] comp, double stk) {

        if (comp == null) {
            return false;
        }
        int cmpCount = comp.length;
        for (int i = 0; i < cmpCount; i++) {
            if (comp[i].getStockPrice() == stk) {
                // System.out.println("Search element " + stk + " FOUND at " + i + "th position
                // \n");
                return true;
            }
        }
        // System.out.println("Search element NOT FOUND...\n");
        return false;
    }

    public static Company[] selectionSort(Company[] comp, boolean order) {
        // System.out.println("Before sort: ");
        if (comp == null) {
            return null;
        }

        int len = comp.length;

        for (int i = 0; i < len - 1; i++) {
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (order == true) { // ascending order
                    if (comp[j].getStockPrice() < comp[index].getStockPrice()) {
                        index = j;
                    }
                } else { // descending order
                    if (comp[j].getStockPrice() > comp[index].getStockPrice()) {
                        index = j;
                    }
                }
            }
            Company tComp = comp[index];
            comp[index] = comp[i];
            comp[i] = tComp;
        }

        // System.out.println("After sort: ");
        return comp;
    }
}
