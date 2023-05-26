package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class Book extends Media {

    private ArrayList<String> authors = new ArrayList<String>();

    public Book() {
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author " + authorName + " added to the book.");
        } else {
            System.out.println("Author " + authorName + " is already associated with the book.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author " + authorName + " removed from the book.");
        } else {
            System.out.println("Author " + authorName + " is not associated with the book.");
        }
    }

}
