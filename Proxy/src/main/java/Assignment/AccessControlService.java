package Assignment;

public class AccessControlService {

    private static AccessControlService instance;
    private boolean hasAccess;

    public static AccessControlService getInstance(){
        if(instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean checkAccess(User user, int id) {
        if(user.getType().equals("admin")) {
             hasAccess = true;
        }else {
             hasAccess = false;
        }
        return hasAccess;
    }

}

