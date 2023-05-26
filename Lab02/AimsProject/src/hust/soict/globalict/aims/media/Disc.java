package hust.soict.globalict.aims.media;

public class Disc extends Media {

    private String director;
    private int length;

    public Disc(String director, int length) {
        super();
        this.director = director;
        this.length = length;
    }

    public Disc() {
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
}
