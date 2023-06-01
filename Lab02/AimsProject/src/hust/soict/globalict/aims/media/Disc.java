package hust.soict.globalict.aims.media;

public class Disc extends Media {

    private String director;
    private int length;

    public Disc(String director, int length) {
        super();
        this.director = director;
        this.length = length;
    }

    public Disc(String title, String category, float cost, int length){
        super(title, category, cost);
        this.length = length;
    }

    public Disc() {
        super();
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void display() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Category: " + this.getCategory());
        System.out.println("Director: " + this.getDirector());
        System.out.println("Length: " + this.getLength());
        System.out.println("Cost: " + this.getCost());
    }

}
