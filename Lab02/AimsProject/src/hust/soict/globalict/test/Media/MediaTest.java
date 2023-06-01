package hust.soict.globalict.test.Media;

import hust.soict.globalict.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> media = new ArrayList<Media>();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book("Calculus", "Science", null, 6.9f);
        CompactDisc cd = new CompactDisc("Let it be", "Rock", 10.9f, 86, "The Beatles");
        book.addAuthor("James Steward");
        media.add(cd);
        media.add(dvd);
        media.add(book);

        for (Media m : media) {
            System.out.println(m.toString());
        }
    }
}