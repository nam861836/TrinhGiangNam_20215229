
/*
import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class Cart {
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();
    private int qtyOrdered = 0;
    private final int MAX_NUMBERS_ORDERED = 20; // maximum number of items in cart

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            qtyOrdered++;
            System.out.println("Added " + disc.getTitle() + " to cart.");
        } else {
            System.out.println("The cart is already full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.remove(disc)) {
            qtyOrdered--;
            System.out.println("Removed " + disc.getTitle() + " from cart.");
        } else {
        }
    }
}
*/

public class Cart {
    private final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full.");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added to the cart.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int i = 0;
        while (i < qtyOrdered && !itemsOrdered[i].equals(disc)) {
            i++;
        }

        if (i == qtyOrdered) {
            System.out.println("The disc is not in the cart.");
        } else {
            for (int j = i; j < qtyOrdered - 1; j++) {
                itemsOrdered[j] = itemsOrdered[j + 1];
            }
            qtyOrdered--;
            System.out.println("The disc has been removed from the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
