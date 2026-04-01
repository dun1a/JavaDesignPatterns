package Assignment;

import javax.print.Doc;

public class Main {

    public static void main(String[] args){

        User user1 = new User("Alice", "admin");
        User user2 = new User("Bob", "guest");

        Document document1 = new RealDocument(1, "This is a public document.", "2024-01-01");
        Document document2 = new RealDocument(2, "This is a protected document.", "2024-02-01");
        Document document3 = new RealDocument(3, "This is another protected document.", "2024-03-01");

        Document documentProxy = new DocumentProxy(document2);

        Document documentProxy2 = new DocumentProxy(document3);

        Library library = new Library();
        library.addDocument(document1);
        library.addDocument(documentProxy);
        library.addDocument(documentProxy2);

        System.out.println("User: " + user1.getUsername());
        System.out.println("Accessing public document:");
        System.out.println(document1.getContent(user1));

        System.out.println("Accessing protected document:");
        System.out.println(library.getDocument(documentProxy.getId()).getContent(user1));
        System.out.println(library.getDocument(documentProxy2.getId()).getContent(user1));
        System.out.println(library.getDocument(documentProxy.getId()).getContent(user2));

    }
}
