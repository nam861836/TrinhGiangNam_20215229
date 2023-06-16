package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private final int MAX_NUMBERS_ORDERED = 100;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    //private int qty = 0;
    public void addMedia(Media media){
        if(itemsOrdered.size() >= MAX_NUMBERS_ORDERED){
            System.out.println("The store is already full.");
        } else {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added to the store.");
        }
    }

    public void removeMedia(Media media){
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else System.out.println(media.getTitle() + " is not in the store.");
    }

    public void displayStore(){
        System.out.println("Items in store: ");
        for (Media media : itemsOrdered){
            System.out.println(media);
        }
    }

    public Media searchByTitle(String title) {

        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                System.out.println("Search results for item with title " + title + ":");
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No item with title " + title + " found in the cart.");
        return null;
    }

    public ArrayList<Media> getItemsInStore(){
        return itemsOrdered;
    }

}
