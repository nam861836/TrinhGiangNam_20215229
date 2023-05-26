package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc {
    private String director;
    private int length;


    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }


    private static int nbDigitalVideoDiscs = 0;


    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public DigitalVideoDisc(String title) {
        //super();
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String category ,String title, float cost) {
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;


    }
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + director + " - " + length + ": " + getCost() + " $";
    }
    public boolean isMatch(String title) {
        return this.getTitle().equals(title);

    }
}
