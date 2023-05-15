
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



}
