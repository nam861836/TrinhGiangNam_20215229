package hust.soict.globalict.aims.media;

public class Track{
    private String director;
    private int length;

    public Track(String director, int length) {
        super();
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
}
