
public class Cart {
    private final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full.");
        } else {
            itemsOrdered[qtyOrdered++] = disc;
            //qtyOrdered++;
            System.out.println("The disc has been added to the cart.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        for (DigitalVideoDisc dvd : dvdList) {
            if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is already full.");
                break;
            }
            itemsOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println(dvd.getTitle() + " has been added to the cart.");
        }
    }
/*
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        int numToAdd = dvds.length;
        if (qtyOrdered + numToAdd > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full.");
            return;
        }
        for (int i = 0; i < numToAdd; i++) {
            itemsOrdered[qtyOrdered] = dvds[i];
            qtyOrdered++;
            System.out.println(dvds[i].getTitle() + " has been added to the cart.");
        }
    }
*/
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full.");
            return;
        }
        itemsOrdered[qtyOrdered] = dvd1;
        qtyOrdered++;
        System.out.println(dvd1.getTitle() + " has been added to the cart.");
        itemsOrdered[qtyOrdered] = dvd2;
        qtyOrdered++;
        System.out.println(dvd2.getTitle() + " has been added to the cart.");
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



    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items: ");
        for (int i = 0; i < qtyOrdered; i++) {
            //DigitalVideoDisc dvd = itemsOrdered[i];
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.printf("Total cost: %.2f\n", totalCost());
        System.out.println("***************************************************");
    }

    public void searchByID(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("The disc with ID " + id + " is in the cart:");
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("No disc with ID " + id + " found in the cart.");
    }

    public void searchByTitle(String title) {

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Search results for discs with title " + title + ":");
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("No discs with title " + title + " found in the cart.");
    }



}
