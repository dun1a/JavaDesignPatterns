package Assignment;

import java.util.Calendar;

// implements the Prototype interface
// copy() method is a
public class Book implements Cloneable {

    private String author;
    private String title;
    private String genre;

    public Book(String author, String title, String genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public Book clone()  {
        try{
        // shallow copy:
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
        // This should never happen since we are Cloneable
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Book { " +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
