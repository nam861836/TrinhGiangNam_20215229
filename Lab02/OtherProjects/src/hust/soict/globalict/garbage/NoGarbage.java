package hust.soict.globalict.garbage;

public class NoGarbage {
    public void noGarbage() {
        System.gc();
        System.runFinalization();
        System.out.println("No Garbage Left!\n");
    }
}
