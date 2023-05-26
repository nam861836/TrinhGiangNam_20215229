package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(String director, int length, String artist, ArrayList<Track> tracks) {
        super(director, length);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String artist, ArrayList<Track> tracks) {
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(){

    }
}
