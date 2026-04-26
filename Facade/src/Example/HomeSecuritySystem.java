package Example;

// implements the methods in SecuritySystem interface
// provides detailed control over the home security logs

public class HomeSecuritySystem implements SecuritySystem {

    @Override
    public void activate() {
        System.out.println("Security system activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Security system deactivated");
    }

    @Override
    public void readLog() {
        System.out.println("Reading security log...");
        System.out.println("Log: Security check complete, no issues found.");
    }
}
