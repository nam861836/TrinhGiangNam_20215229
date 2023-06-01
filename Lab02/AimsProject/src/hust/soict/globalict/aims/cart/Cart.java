package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.MediaComparatorByCostTitle;
import hust.soict.globalict.aims.media.MediaComparatorByTitleCost;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Cart {
    private final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();


    public void addMedia(Media media){
        if(itemsOrdered.size() >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is already full.");
        } else {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added to the cart.");
        }
    }

    public void addMedia(ArrayList<Media> mediaList) {
        for (Media media : mediaList) {
            if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is already full.");
                break;
            }
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added to the cart.");
        }
    }

    public void removeMedia(Media media){
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The item has been removed from the cart.");
        } else System.out.println("The item is not in the cart.");
    }

    public void removeMediaByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                removeMedia(media);
                return;
            }
        }
    }

    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items: ");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            //hust.soict.globalict.aims.media.DigitalVideoDisc dvd = itemsOrdered[i];
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.printf("Total cost: %.2f $\n", totalCost());
        System.out.println("***************************************************");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

    public void searchByID(int id) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getId() == id) {
                System.out.println("The item with ID " + id + " is in the cart:");
                System.out.println(itemsOrdered.get(i).toString());
                return;
            }
        }
        System.out.println("No item with ID " + id + " found in the cart.");
    }

    public void searchByTitle(String title) {

        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).isMatch(title)) {
                System.out.println("Search results for item with title " + title + ":");
                System.out.println(itemsOrdered.get(i).toString());
                return;
            }
        }
        System.out.println("No item with title " + title + " found in the cart.");
    }

    public void filterMediaByID(int id) {
        ArrayList<Media> newList = new ArrayList<>();
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                newList.add(media);
            }
        }
        if (newList.isEmpty()) {
            System.out.println("No media found.");
        } else {
            System.out.println("Media(s) with the given ID:");
            for (Media media : newList) {
                media.display();
            }
        }
    }

    public void filterByTitle(String title) {
        ArrayList<Media> newList = new ArrayList<>();
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                newList.add(media);
            }
        }
        if (newList.isEmpty()) {
            System.out.println("No media found.");
        } else {
            System.out.println("Media(s) with the given title:");
            for (Media media : newList) {
                media.display();
            }
        }
    }

    public void sortByTitle(){
        Collections.sort(itemsOrdered, new MediaComparatorByTitleCost());
        System.out.println("Media sorted by title:");
        print();
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, new MediaComparatorByCostTitle());
        System.out.println("Media sorted by cost:");
        print();
    }

    public int countDVD() {
        int count = 0;
        for (Media media : itemsOrdered) {
            if (media instanceof DigitalVideoDisc) {
                count++;
            }
        }
        return count;
    }

    public void empty(){
        itemsOrdered.clear();
    }
}
