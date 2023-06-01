package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;


    public CompactDisc(String title, String category, float cost, int length, String artist){
        super(title, category, cost, length);
        this.artist = artist;
    }


    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track " + track.getTitle() + " is already in the list of tracks.");
        } else {
            tracks.add(track);
            System.out.println("The track " + track.getTitle() + " has been added to the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("The track " + track.getTitle() + " has been removed from the CD.");
        } else {
            System.out.println("The track " + track.getTitle() + " is not in the list of tracks.");
        }
    }

    public int getTotalLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void play() {
        System.out.println("Playing CompactDisc:");
        for (Track track : tracks) {
            track.play();
        }
    }

    public String toString() {
        return "Compact Disc: " + getTitle() + " - " + getArtist() + " - " + getCategory() + " - " + getLength() + " - " + getCost() + " $ ";
    }
}

