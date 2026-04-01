package Assignment;

import java.time.LocalDate;

public interface Document {

    String getContent(User user);
    LocalDate getCreationDate();
    int getId();
}
