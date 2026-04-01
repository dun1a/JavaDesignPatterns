package Assignment;

import java.time.LocalDate;

public class RealDocument implements Document{

    private String content;
    public LocalDate creationDate;
    public int id;
    public int idCounter;

    public RealDocument(int id, String content, String creationDate) {
        this.content = content;
        this.creationDate = LocalDate.now();
        this.id = id;
        this.id = idCounter++;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public int getId() {
        return id;
    }
}
