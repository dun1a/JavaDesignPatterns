package Assignment;

import java.time.LocalDate;

public class DocumentProxy implements Document {

    private Document document;
    private AccessControlService accessControl = new AccessControlService();

    // realObject is provided to the proxy when the documents are protected
    public DocumentProxy(Document document) {
        this.document = document;
    }

    // because the proxy (in this case) is only responsible for access control
    // it doesn't need to create the realObject
    @Override
    public String getContent(User user){
        AccessDeniedException exception = new AccessDeniedException("Access denied for user : " + user.getUsername());
        if(!accessControl.checkAccess(user, document.getId())) {
            return exception.getErrorMessage();
        }
        return document.getContent(user);
    }

    @Override
    public LocalDate getCreationDate() {
        return document.getCreationDate();
    }

    @Override
    public int getId() {
        return document.getId();
    }

}
