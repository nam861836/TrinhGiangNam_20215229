package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class Book extends Media {

    private ArrayList<String> authors = new ArrayList<String>();

    public Book() {
    }

    public Book(String title, float cost) {
        super();
        this.setTitle(title);
        this.setCost(cost);
    }

    public Book(String title, String category, float cost) {
        super();
        this.setTitle(title);
        this.setTitle(category);
        this.setCost(cost);
    }

    public Book(String title, String category, String author, float cost) {
        super(title, category, cost);
    }

    public ArrayList<String> getAuthors() {
        return authors;
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

    public String toString() {
        return "Book: " + getTitle() + " - " + getCategory() + " - " + getAuthors() + " - "  + getCost() + " $";
    }
    @Override
    public void display(){
        System.out.println("Title: " + this.getTitle());
        System.out.println("Authors: ");
        for (String author : authors)
        System.out.println(author);

        System.out.println("Cost: " + this.getCost());
    }
}
