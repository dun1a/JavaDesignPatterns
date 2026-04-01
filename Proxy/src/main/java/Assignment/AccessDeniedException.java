package Assignment;

public class AccessDeniedException {

    private String errorMessage;

    public AccessDeniedException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
