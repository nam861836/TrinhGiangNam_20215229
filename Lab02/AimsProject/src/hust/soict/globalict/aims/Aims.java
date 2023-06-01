package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.Store;

import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void viewStore() {
        System.out.println("----- ITEMS IN STORE -----");
        store.displayStore();
        System.out.println("--------------------------");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            storeMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addToCart();
                    break;
                case 3:
                    play();
                    break;
                case 4:
                    seeCart();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
            System.out.println();
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void seeMediaDetails() {
        System.out.println("Enter the title: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);
        if (media != null) {
            media.display();
            mediaDetailsMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    cart.addMedia(media);
                    break;
                case 2:
                    playable(media);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void playable(Media media){
        if (media instanceof Playable) ((Playable) media).play();
        else System.out.println("This media is not playable.");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void addToCart() {
        System.out.println("Enter the title:");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        Media media = store.searchByTitle(title);
        if (media != null) {
            cart.addMedia(media);
            if (media instanceof DigitalVideoDisc) {
                int dvdCount = cart.countDVD();
                System.out.println("DVDs in cart: " + dvdCount);
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void play() {
        System.out.println("Enter the title:");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        Media media = store.searchByTitle(title);
        if (media != null) {
            if (media instanceof Playable) {
                ((Playable) media).play();
            } else {
                System.out.println("This media is not playable.");
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void seeCart() {
        cart.print();
        cartMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    filterMedia();
                    break;
                case 2:
                    sortCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    play();
                    break;
                case 5:
                    placeOrder();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            cartMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void filterMedia() {
        System.out.println("Filter medias in cart by:");
        System.out.println("1. ID");
        System.out.println("2. Title");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter the ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            cart.filterMediaByID(id);

        } else if (choice == 2) {
            System.out.println("Enter the title: ");
            String title = scanner.nextLine();
            cart.filterByTitle(title);

        } else System.out.println("Invalid choice. Please try again.");
    }

    public static void sortCart(){
        System.out.println("Sort medias in cart by:");
        System.out.println("1. Title");
        System.out.println("2. Cost");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) cart.sortByTitle();
        else if (choice == 2) cart.sortByCost();
        else System.out.println("Invalid choice. Please try again.");
    }

    public static void removeMediaFromCart() {
        System.out.println("Enter the title:");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        cart.removeMediaByTitle(title);
    }

    public static void placeOrder() {
        System.out.println("Order created.");
        cart.empty();
    }

    public static void updateStore() {
        updateStoreMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    //store.addMedia();
                    break;
                case 2:
                    //store.removeMedia();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            updateStoreMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
    public static void updateStoreMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Add a media to store");
        System.out.println("2. Remove a media from store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void addMedia(){
        store = new Store();
        cart = new Cart();
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book("Calculus", "Science",null, 6.9f);
        CompactDisc cd = new CompactDisc("Let it be", "Rock", 10.9f, 86, "The Beatles");
        book.addAuthor("James Steward");
        store.addMedia(dvd);
        store.addMedia(book);
        store.addMedia(cd);
    }

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCart();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        addMedia();
        run();
    }
}

