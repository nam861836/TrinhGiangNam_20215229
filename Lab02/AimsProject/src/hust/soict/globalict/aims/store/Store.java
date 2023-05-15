package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
    private final int MAX_NUMBERS_ORDERED = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qty = 0;
    public void addDVD(DigitalVideoDisc disc) {
        if (qty >= MAX_NUMBERS_ORDERED) {
            System.out.println("The store is already full.");
        } else {
            itemsInStore[qty] = disc;
            qty++;
            System.out.println("The disc has been added to the store.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        int i = 0;
        while (i < qty && !itemsInStore[i].equals(disc)) {
            i++;
        }

        if (i == qty) {
            System.out.println("The disc is not in the store.");
        } else {
            for (int j = i; j < qty - 1; j++) {
                itemsInStore[j] = itemsInStore[j + 1];
            }
            qty--;
            System.out.println("The disc has been removed from the store.");
        }
    }
}
