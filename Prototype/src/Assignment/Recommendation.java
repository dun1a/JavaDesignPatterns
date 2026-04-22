package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {

    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Recommendation clone() {
        Recommendation clonedRecommendation =  new Recommendation(targetAudience);
        clonedRecommendation.targetAudience = this.targetAudience;
        clonedRecommendation.books = new ArrayList<>();
        // deep copy of the books list
        for (Book book : this.books) {
            clonedRecommendation.addBook(book.clone());
        }
        return clonedRecommendation;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recommendation for ").append(targetAudience).append(":\n");
        for (Book book : books) {
            sb.append("- ").append(book).append("\n");
        }
        return sb.toString();
    }
}
