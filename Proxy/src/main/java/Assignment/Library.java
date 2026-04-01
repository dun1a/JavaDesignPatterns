package Assignment;

import java.util.HashMap;

public class Library {

    private HashMap<Integer, Document> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(Document document) {
        documents.put(document.getId(), document);
    }


    public Document getDocument(int id) {
        return documents.get(id);
    }


}
